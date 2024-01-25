import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qd", name = "i", descriptor = "[J")
	public static final long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "[Lclient!cj;")
	public static final Class35[] aClass35Array1 = new Class35[29];

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "[I")
	public static final int[] anIntArray381 = new int[100];

	@OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
	public static int anInt4957 = 0;

	@OriginalMember(owner = "client!qd", name = "wb", descriptor = "I")
	public static int anInt4963 = 0;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!en;)V")
	public static void method4415(@OriginalArg(1) Class59 arg0) {
		@Pc(7) int local7 = Static303.anInt5839;
		@Pc(9) int local9 = Static279.anInt5429;
		@Pc(11) int local11 = Static144.anInt2967;
		@Pc(15) int local15 = Static343.anInt6411 - 3;
		if (Static263.aClass54_15 == null || Static84.aClass54_5 == null) {
			if (Static317.aClass170_114.method4568(Static319.anInt6056) && Static317.aClass170_114.method4568(Static353.anInt6599)) {
				Static263.aClass54_15 = arg0.method4872(Static360.method907(Static317.aClass170_114, Static319.anInt6056, 0));
				@Pc(44) Class37 local44 = Static360.method907(Static317.aClass170_114, Static353.anInt6599, 0);
				Static84.aClass54_5 = arg0.method4872(local44);
				local44.method908();
				Static31.aClass54_2 = arg0.method4872(local44);
			} else {
				arg0.method4877(local7, local9, local11, 20, 255 - Static122.anInt2594 << 24 | Static52.anInt1326, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static263.aClass54_15 != null && Static84.aClass54_5 != null) {
			local87 = (local11 - Static84.aClass54_5.method5577() * 2) / Static263.aClass54_15.method5577();
			for (local89 = 0; local89 < local87; local89++) {
				Static263.aClass54_15.method5569(local7 + Static84.aClass54_5.method5577() + Static263.aClass54_15.method5577() * local89, local9);
			}
			Static84.aClass54_5.method5569(local7, local9);
			Static31.aClass54_2.method5569(local11 + local7 - Static31.aClass54_2.method5577(), local9);
		}
		Static190.aClass91_8.method5300(-1, local9 + 14, Static103.aString140, Static17.anInt5992 | 0xFF000000, local7 + 3);
		arg0.method4877(local7, local9 + 20, local11, local15 - 20, -Static122.anInt2594 + 255 << 24 | Static52.anInt1326, 1);
		local87 = Static270.anInt5171;
		local89 = Static274.anInt5378;
		@Pc(184) int local184;
		for (@Pc(167) int local167 = 0; local167 < Static27.anInt5324; local167++) {
			local184 = (Static27.anInt5324 - local167 - 1) * 16 + local9 + 20 + 13;
			if (local87 > local7 && local87 < local11 + local7 && local89 > local184 - 13 && local89 < local184 + 3) {
				arg0.method4877(local7, local184 - 12, local11, 16, Static263.anInt5071 | 255 - Static310.anInt5949 << 24, 1);
			}
		}
		if ((Static168.aClass54_9 == null || Static131.aClass54_8 == null || Static81.aClass54_4 == null) && Static317.aClass170_114.method4568(Static298.anInt5727) && Static317.aClass170_114.method4568(Static327.anInt6205) && Static317.aClass170_114.method4568(Static195.anInt3838)) {
			@Pc(265) Class37 local265 = Static360.method907(Static317.aClass170_114, Static327.anInt6205, 0);
			Static131.aClass54_8 = arg0.method4872(local265);
			local265.method908();
			Static180.aClass54_10 = arg0.method4872(local265);
			Static168.aClass54_9 = arg0.method4872(Static360.method907(Static317.aClass170_114, Static298.anInt5727, 0));
			@Pc(290) Class37 local290 = Static360.method907(Static317.aClass170_114, Static195.anInt3838, 0);
			Static81.aClass54_4 = arg0.method4872(local290);
			local290.method908();
			Static320.aClass54_22 = arg0.method4872(local290);
		}
		@Pc(359) int local359;
		@Pc(361) int local361;
		if (Static168.aClass54_9 != null && Static131.aClass54_8 != null && Static81.aClass54_4 != null) {
			local184 = (local11 - Static81.aClass54_4.method5577() * 2) / Static168.aClass54_9.method5577();
			for (@Pc(321) int local321 = 0; local321 < local184; local321++) {
				Static168.aClass54_9.method5569(local7 + Static81.aClass54_4.method5577() + local321 * Static168.aClass54_9.method5577(), local15 + local9 - Static168.aClass54_9.method5565());
			}
			local359 = (local15 - Static81.aClass54_4.method5565() - 20) / Static131.aClass54_8.method5565();
			for (local361 = 0; local361 < local359; local361++) {
				Static131.aClass54_8.method5569(local7, local9 + local361 * Static131.aClass54_8.method5565() + 20);
				Static180.aClass54_10.method5569(local7 + local11 - Static180.aClass54_10.method5577(), Static131.aClass54_8.method5565() * local361 + local9 - -20);
			}
			Static81.aClass54_4.method5569(local7, local9 + local15 - Static81.aClass54_4.method5565());
			Static320.aClass54_22.method5569(local7 + local11 - Static81.aClass54_4.method5577(), local9 - -local15 - Static81.aClass54_4.method5565());
		}
		local184 = 0;
		for (@Pc(436) Class5_Sub4 local436 = (Class5_Sub4) Static60.aClass211_4.method5608(); local436 != null; local436 = (Class5_Sub4) Static60.aClass211_4.method5603()) {
			local359 = local9 + (-local184 + -1 + Static27.anInt5324) * 16 + 20 + 13;
			local361 = Static17.anInt5992 | 0xFF000000;
			if (local7 < local87 && local87 < local11 + local7 && local359 - 13 < local89 && local89 < local359 + 3) {
				local361 = Static328.anInt6216 | 0xFF000000;
			}
			@Pc(485) int[] local485 = null;
			if (Static327.method5513(local436.anInt785)) {
				local485 = Static88.method1382((int) local436.aLong24).anIntArray382;
			} else if (Static93.method1989(local436.anInt785)) {
				@Pc(511) Class25_Sub1_Sub1_Sub2 local511 = Static188.aClass25_Sub1_Sub1_Sub2Array1[(int) local436.aLong24];
				if (local511 != null) {
					local485 = local511.aClass216_1.anIntArray560;
				}
			} else if (Static199.method3530(local436.anInt785)) {
				if (local436.anInt785 == 1002) {
					local485 = Static228.method3923((int) local436.aLong24).anIntArray298;
				} else {
					local485 = Static228.method3923((int) (local436.aLong24 >>> 32 & 0x7FFFFFFFL)).anIntArray298;
				}
			}
			@Pc(558) String local558 = Static55.method1184(local436);
			if (local485 != null) {
				local558 = local558 + Static346.method5697(local485);
			}
			local184++;
			Static190.aClass91_8.method5303(local558, 0, local361, Static311.anIntArray557, local359, local7 + 3, Static49.aClass54Array4);
		}
		Static82.method1818(Static279.anInt5429, Static303.anInt5839, Static144.anInt2967, Static343.anInt6411);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
	public static void method4417() {
		Static352.aClass5_Sub17_Sub2_3.method3181();
		Static110.aClass170_48 = null;
		Static200.anInt5712 = 1;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIII)V")
	public static void method4419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class5_Sub9_Sub16 local8 = Static239.method4052(11, arg0);
		local8.method4140();
		local8.anInt4721 = arg1;
		local8.anInt4723 = arg2;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)I")
	public static int method4422(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method4426() {
		Static335.aClass5_Sub1_Sub1_3.method174(100);
		Static335.aClass5_Sub1_Sub1_3.method1870(Static339.anInt6356);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method4430() {
		Static279.aClass66_93.method1942();
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public static void method4433() {
		Static261.aString297 = "Conectado ao servidor de atualização";
		Static260.aString371 = "onda2:";
		Static231.aString264 = "Mecanismo de som preparado";
		Static197.aString228 = "Cancelar";
		Static27.aString306 = "nível: ";
		Static120.aString161 = "brilho3:";
		Static341.aString366 = "Mechscape carregando. Aguarde...";
		Static135.aString175 = "M";
		Static287.aString321 = "Carregando texturas - ";
		Static344.aString62 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static180.aString213 = "Fontes carregadas";
		Static47.aString65 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static251.aString289 = "Não é possível encontrar ";
		Static285.aString334 = "Interfaces carregadas";
		Static47.aString66 = "Carregando...";
		Static68.aString98 = "Conexão perdida.";
		Static117.aString157 = "Lista de atualizações carregada";
		Static348.aString375 = "Memória alocada";
		Static314.aString341 = "As variáveis do sistema foram carregadas";
		Static158.aString195 = "Carregando config - ";
		Static260.aString370 = " mais opções";
		Static295.aString328 = "Carregando interfaces - ";
		Static202.aString232 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static20.aString33 = "flash2:";
		Static139.aString355 = "brilho1:";
		Static195.aString226 = "qualificação: ";
		Static199.aString230 = "Carregando fontes - ";
		Static248.aString284 = "Atacar";
		Static246.aString281 = "Carregando pacote de palavras - ";
		Static273.aString307 = "Dados da lista de mundos carregados";
		Static136.aString177 = "Caminhar para cá";
		Static286.aString319 = "onda:";
		Static122.aString169 = "Biblioteca 3D iniciada";
		Static38.aString59 = "Pacote de palavras carregado";
		Static22.aString35 = "Selecionar";
		Static226.aString260 = "Fechar";
		Static83.aString122 = "Oculto";
		Static222.aString257 = "Config carregada";
		Static283.aString315 = "rolagem:";
		Static268.aString379 = "Tela título aberta";
		Static13.aString29 = "brilho2:";
		Static230.aString263 = "deslizamento:";
		Static145.aString359 = "tremor:";
		Static336.aString312 = "Verificando atualizações - ";
		Static8.aString9 = "Padrões carregados";
		Static346.aString372 = "verde:";
		Static312.aString340 = "roxo:";
		Static106.aString146 = "Largar";
		Static67.aString96 = "Gerenciador de entradas carregado";
		Static57.aString81 = "K";
		Static211.aString243 = " saiu do jogo.";
		Static181.aString217 = "Remova ";
		Static73.aString105 = "cyan:";
		Static216.aString250 = " ";
		Static180.aString212 = "Carregando sprites - ";
		Static135.aString176 = "Alocando memória";
		Static118.aString158 = "Texturas carregadas";
		Static264.aString193 = "Continuar";
		Static139.aString354 = "Examinar";
		Static32.aString52 = "habilidade: ";
		Static353.aString381 = "M";
		Static192.aString223 = "Universo de jogo criado";
		Static214.aString245 = "Aguarde...";
		Static35.aString55 = "RuneScape carregando. Aguarde...";
		Static276.aString310 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static90.aString252 = " já está na sua lista de ignorados.";
		Static334.aString363 = "Carregando. Aguarde.";
		Static59.aString83 = "Carregando padrões - ";
		Static324.aString352 = "flash1:";
		Static64.aString93 = "Carregando tela título - ";
		Static162.aString200 = " da sua lista de ignorados primeiro.";
		Static99.aString132 = "Ok";
		Static261.aString296 = "Virar para cá";
		Static63.aString87 = "Tentando reestabelecer conexão. Aguarde.";
		Static133.aString380 = "Conectando ao servidor de atualização";
		Static183.aString219 = " entrou no jogo.";
		Static91.aString127 = " já está na sua lista de amigos.";
		Static35.aString56 = "Objeto para membros";
		Static240.aString268 = "amarelo:";
		Static350.aString377 = " da sua lista de amigos primeiro.";
		Static120.aString162 = "branco:";
		Static129.aString172 = "Descartar";
		Static243.aString275 = "Tela título carregada";
		Static177.aString150 = "Pegar";
		Static25.aString38 = "vermelho:";
		Static121.aString167 = "Sprites carregados";
		Static64.aString92 = "Remova ";
		Static238.aString267 = "brilho3:";
		Static252.aString290 = "Iniciando biblioteca 3D";
		Static121.aString166 = "Usar";
		Static290.aString323 = "K";
		Static4.aString1 = "Carregando dados da lista de mundos";
		Static103.aString140 = "Selecionar opção";
	}
}
