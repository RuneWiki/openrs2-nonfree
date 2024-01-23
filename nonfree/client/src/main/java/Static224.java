import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "[I")
	public static int[] anIntArray348;

	@OriginalMember(owner = "client!pn", name = "h", descriptor = "[I")
	public static int[] anIntArray349;

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
	public static int anInt4119;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "J")
	public static long aLong145 = 0L;

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "[I")
	public static int[] anIntArray347 = new int[14];

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public static int anInt4117 = 0;

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "I")
	public static int anInt4118 = 0;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "[J")
	public static long[] aLongArray12 = new long[100];

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIFZI)[[I")
	public static int[][] method3474(@OriginalArg(6) float arg0) {
		@Pc(9) Class1_Sub4_Sub20 local9 = new Class1_Sub4_Sub20();
		local9.anInt2676 = 4;
		local9.anInt2663 = 8;
		local9.anInt2673 = (int) (arg0 * (float) 4096);
		@Pc(26) int[][] local26 = new int[256][64];
		local9.anInt2668 = 3;
		local9.aBoolean167 = false;
		local9.method4755();
		Static225.method3499(256, 64);
		for (@Pc(41) int local41 = 0; local41 < 256; local41++) {
			local9.method2318(local41, local26[local41]);
		}
		return local26;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!wf;BILclient!o;Lclient!ia;II)V")
	public static void method3476(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub5_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class15_Sub5_Sub1 arg3, @OriginalArg(5) Class71 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Class1_Sub8 local5 = new Class1_Sub8();
		local5.anInt508 = arg5 * 128;
		local5.anInt519 = arg6;
		local5.anInt507 = arg2 * 128;
		if (arg4 != null) {
			local5.anInt512 = arg4.anInt2351;
			local5.anInt513 = arg4.anInt2345;
			local5.anInt523 = arg4.anInt2379;
			@Pc(155) int local155 = arg4.anInt2377;
			local5.anInt515 = arg4.anInt2386;
			local5.aClass71_1 = arg4;
			local5.anIntArray29 = arg4.anIntArray208;
			local5.anInt510 = arg4.anInt2355 * 128;
			@Pc(175) int local175 = arg4.anInt2385;
			if (arg0 == 1 || arg0 == 3) {
				local175 = arg4.anInt2377;
				local155 = arg4.anInt2385;
			}
			local5.anInt509 = (arg2 + local155) * 128;
			local5.anInt522 = (local175 + arg5) * 128;
			if (arg4.anIntArray209 != null) {
				local5.aBoolean20 = true;
				local5.method471();
			}
			if (local5.anIntArray29 != null) {
				local5.anInt520 = local5.anInt513 + (int) ((double) (local5.anInt515 - local5.anInt513) * Math.random());
			}
			Static75.aClass59_18.method1706(local5);
		} else if (arg3 != null) {
			@Pc(36) Class99 local36 = arg3.aClass99_1;
			local5.aClass15_Sub5_Sub1_1 = arg3;
			if (local36.anIntArray255 != null) {
				local5.aBoolean20 = true;
				local36 = local36.method2647();
			}
			if (local36 != null) {
				local5.anInt509 = (local36.anInt3050 + arg2) * 128;
				local5.anInt522 = (arg5 + local36.anInt3050) * 128;
				local5.anInt512 = Static210.method3344(arg3);
				local5.anInt510 = local36.anInt3075 * 128;
				local5.anInt523 = local36.anInt3049;
			}
			Static93.aClass59_20.method1706(local5);
		} else if (arg1 != null) {
			local5.aClass15_Sub5_Sub2_1 = arg1;
			local5.anInt509 = (arg2 + arg1.method4702()) * 128;
			local5.anInt522 = (arg1.method4702() + arg5) * 128;
			local5.anInt512 = Static84.method1586(arg1);
			local5.anInt510 = arg1.anInt5607 * 128;
			local5.anInt523 = arg1.anInt5623;
			Static132.aClass142_18.method3537(local5, Static124.method4681(arg1.aString336));
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V")
	public static void method3479() {
		Static108.aString129 = "Não é possível encontrar ";
		Static180.aString200 = "Carregando. Aguarde.";
		Static279.aString295 = "qualificação: ";
		Static218.aString71 = "Biblioteca 3D iniciada";
		Static181.aString201 = " da sua lista de ignorados primeiro.";
		Static40.aString322 = "Ok";
		Static239.aString247 = " já está na sua lista de ignorados.";
		Static229.aString237 = "Aguarde...";
		Static266.aString285 = "M";
		Static72.aString328 = "roxo:";
		Static56.aString65 = "Fontes carregadas";
		Static244.aString255 = "Selecionar opção";
		Static229.aString238 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static300.aString326 = "Mecanismo de som preparado";
		Static315.aString312 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static252.aString270 = "onda:";
		Static151.aString165 = "onda2:";
		Static199.aString212 = "Pegar";
		Static240.aString249 = "Interfaces carregadas";
		Static209.aString223 = "Tela título aberta";
		Static226.aString234 = "amarelo:";
		Static190.aString206 = "Tela título carregada";
		Static174.aString196 = "Alocando memória";
		Static308.aString334 = "Caminhar para cá";
		Static4.aString6 = "Remova ";
		Static110.aString130 = "K";
		Static47.aString52 = " mais opções";
		Static262.aString283 = "deslizamento:";
		Static207.aString221 = " ";
		Static82.aString99 = "Carregando...";
		Static282.aString302 = " entrou no jogo.";
		Static3.aString5 = "Conectado ao servidor de atualização";
		Static196.aString209 = "Carregando sprites - ";
		Static296.aString320 = "Examinar";
		Static153.aString171 = "K";
		Static167.aString187 = "flash2:";
		Static135.aString155 = "Mechscape carregando. Aguarde...";
		Static12.aString17 = "Iniciando biblioteca 3D";
		Static210.aString226 = "brilho3:";
		Static285.aString306 = "Remova ";
		Static311.aString339 = "Continuar";
		Static117.aString140 = "Cancelar";
		Static240.aString248 = "Verificando atualizações - ";
		Static2.aString4 = "Carregando /secure/libs_v4s/RCras - ";
		Static56.aString64 = " já está na sua lista de amigos.";
		Static71.aString87 = "Padrões carregados";
		Static123.aString143 = "brilho1:";
		Static175.aString197 = "Carregando dados da lista de mundos";
		Static234.aString240 = "RuneScape carregando. Aguarde...";
		Static235.aString317 = "Memória alocada";
		Static307.aString332 = "Dados da lista de mundos carregados";
		Static202.aString214 = "Conectando ao servidor de atualização";
		Static237.aString246 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static290.aString309 = "Selecionar";
		Static176.aString198 = "Texturas carregadas";
		Static16.aString341 = "Oculto";
		Static245.aString259 = "Sprites carregados";
		Static173.aString193 = "Lista de atualizações carregada";
		Static293.aString315 = " saiu do jogo.";
		Static203.aString216 = "deseja negociar com você.";
		Static253.aString274 = "Config carregada";
		Static280.aString300 = "Virar para cá";
		Static126.aString109 = "flash1:";
		Static54.aString62 = "Tentando reestabelecer conexão. Aguarde.";
		Static274.aString290 = "vermelho:";
		Static52.aString337 = "Carregando fontes - ";
		Static35.aString222 = "Usar";
		Static12.aString18 = "nível: ";
		Static290.aString310 = "Objeto para membros";
		Static313.aString168 = "Conexão perdida.";
		Static66.aString244 = "Carregando tela título - ";
		Static296.aString319 = "habilidade: ";
		Static115.aString137 = " da sua lista de amigos primeiro.";
		Static269.aString142 = "Universo de jogo criado";
		Static86.aString103 = "Carregando interfaces - ";
		Static242.aString252 = "M";
		Static72.aString329 = "cyan:";
		Static79.aString96 = "Gerenciador de entradas carregado";
		Static237.aString245 = "Carregando config - ";
		Static20.aString24 = "verde:";
		Static63.aString183 = "Largar";
		Static61.aString75 = "tremor:";
		Static116.aString139 = "Descartar";
		Static290.aString308 = "Pacote de palavras carregado";
		Static192.aString208 = "brilho3:";
		Static103.aString118 = "Carregando pacote de palavras - ";
		Static162.aString180 = "Fechar";
		Static131.aString150 = "brilho2:";
		Static26.aString31 = "Carregando padrões - ";
		Static218.aString70 = "branco:";
		Static245.aString258 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static225.aString233 = "Atacar";
		Static170.aString192 = "rolagem:";
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IJ)V")
	public static void method3482(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static120.anInt2510 >= 100 && !Static72.aBoolean364 || Static120.anInt2510 >= 200) {
			Static243.method4744(Static237.aString246, 0, "");
			return;
		}
		@Pc(31) String local31 = Static113.method2021(arg0);
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static120.anInt2510; local33++) {
			if (arg0 == Static204.aLongArray10[local33]) {
				Static243.method4744(local31 + Static56.aString64, 0, "");
				return;
			}
		}
		for (local33 = 0; local33 < Static72.anInt5402; local33++) {
			if (arg0 == Static29.aLongArray3[local33]) {
				Static243.method4744(Static285.aString306 + local31 + Static181.aString201, 0, "");
				return;
			}
		}
		if (local31.equals(Static90.aClass15_Sub5_Sub2_2.aString336)) {
			Static243.method4744(Static229.aString238, 0, "");
			return;
		}
		Static106.aStringArray16[Static120.anInt2510] = local31;
		Static204.aLongArray10[Static120.anInt2510] = arg0;
		Static170.anIntArray283[Static120.anInt2510] = 0;
		Static239.aStringArray33[Static120.anInt2510] = "";
		Static63.anIntArray276[Static120.anInt2510] = 0;
		Static208.aBooleanArray17[Static120.anInt2510] = false;
		Static120.anInt2510++;
		Static70.anInt1491 = Static86.anInt1698;
		Static127.aClass1_Sub14_Sub1_3.method1408(38);
		Static127.aClass1_Sub14_Sub1_3.method1374(arg0);
	}
}
