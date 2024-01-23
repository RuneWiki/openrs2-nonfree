import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "[I")
	public static int[] anIntArray430 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLjava/lang/String;I)I")
	public static int method3765(@OriginalArg(1) String arg0) {
		return Static98.method1592(16, arg0);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	public static void method3766() {
		aShortArrayArray3 = null;
		anIntArray430 = null;
		aByteArrayArray19 = null;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3767(@OriginalArg(0) int arg0) {
		return Static35.aStringArray7[arg0].length() <= 0 ? Static261.aStringArray34[arg0] : Static261.aStringArray34[arg0] + Static254.aString164 + Static35.aStringArray7[arg0];
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	public static void method3768() {
		Static49.aClass33_9.method839();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public static void method3769() {
		if (Static295.anInt5481 < 0) {
			Static92.anInt1911 = -1;
			Static299.anInt5561 = -1;
			Static295.anInt5481 = 0;
		}
		if (Static295.anInt5481 > Static269.anInt5031) {
			Static92.anInt1911 = -1;
			Static299.anInt5561 = -1;
			Static295.anInt5481 = Static269.anInt5031;
		}
		if (Static96.anInt2064 < 0) {
			Static92.anInt1911 = -1;
			Static299.anInt5561 = -1;
			Static96.anInt2064 = 0;
		}
		if (Static96.anInt2064 > Static92.anInt1912) {
			Static299.anInt5561 = -1;
			Static96.anInt2064 = Static92.anInt1912;
			Static92.anInt1911 = -1;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	public static void method3770() {
		Static118.method2032();
		Static116.aClass4_Sub2_Sub1_4 = null;
		Static103.anInt2191 = -1;
		Static116.method1999();
		Static188.aClass69_6.method1932();
		Static90.aClass154_1 = new Class154();
		((Class71_Sub1) Static204.anInterface2_1).method1986();
		Static285.method4283();
		Static12.anInt225 = 0;
		Static12.aClass155Array1 = new Class155[255];
		Static203.method3183();
		Static64.method976();
		Static136.method2180();
		Static261.method3958(false);
		Static275.method4100();
		Static284.method4271();
		for (@Pc(50) int local50 = 0; local50 < 2048; local50++) {
			@Pc(57) Class12_Sub3_Sub2 local57 = Static257.aClass12_Sub3_Sub2Array1[local50];
			if (local57 != null) {
				local57.anObject6 = null;
			}
		}
		if (Static178.aBoolean216) {
			Static64.method980();
			Static140.method2283(Static92.aBoolean144);
			Static109.method1761();
		}
		Static162.method2521(Static288.aClass98_66, Static197.aClass98_116);
		Static120.method2048(Static288.aClass98_66);
		Static250.aClass4_Sub2_Sub1_8 = null;
		Static170.aClass4_Sub2_Sub1_6 = null;
		Static28.aClass4_Sub2_Sub1_2 = null;
		Static266.aClass4_Sub2_Sub1_10 = null;
		Static3.aClass4_Sub2_Sub1_1 = null;
		if (Static267.anInt3573 == 5) {
			Static96.method1561(Static288.aClass98_66);
		}
		if (Static267.anInt3573 == 10) {
			Static49.method846(false);
		}
		if (Static267.anInt3573 == 30) {
			Static264.method3976(25);
		}
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)[Lclient!hi;")
	public static Class59[] method3771() {
		@Pc(14) Class59[] local14 = new Class59[Static84.anInt1699];
		for (@Pc(16) int local16 = 0; local16 < Static84.anInt1699; local16++) {
			if (Static178.aBoolean216) {
				local14[local16] = new Class59_Sub1(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local16], Static100.anIntArray223[local16], Static159.anIntArray285[local16], Static46.anIntArray120[local16], Static274.aByteArrayArray20[local16], Static6.anIntArray14);
			} else {
				local14[local16] = new Class59_Sub2(Static15.anInt278, Static197.anInt3881, Static262.anIntArray439[local16], Static100.anIntArray223[local16], Static159.anIntArray285[local16], Static46.anIntArray120[local16], Static274.aByteArrayArray20[local16], Static6.anIntArray14);
			}
		}
		Static268.method4006();
		return local14;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
	public static void method3772() {
		Static145.aString96 = "Interfaces carregadas";
		Static158.aString105 = "Texturas carregadas";
		Static3.aString2 = "Carregando...";
		Static257.aString168 = "Lista de atualizações carregada";
		Static176.aString19 = "Carregando tela título - ";
		Static104.aString66 = "Padrões carregados";
		Static38.aString17 = "vermelho:";
		Static259.aString170 = "Verificando atualizações - ";
		Static158.aString106 = "Carregando dados da lista de mundos";
		Static81.aString129 = "Carregando /secure/libs_v4s/RCras - ";
		Static244.aString159 = "cyan:";
		Static41.aString20 = " já está na sua lista de ignorados.";
		Static215.aString135 = "Oculto";
		Static234.aString154 = "amarelo:";
		Static222.aString142 = "Alocando memória";
		Static225.aString145 = "Dados da lista de mundos carregados";
		Static233.aString153 = "Tela título aberta";
		Static255.aString166 = "deseja negociar com você.";
		Static46.aString28 = "Carregando sprites - ";
		Static1.aString1 = "Carregando interfaces - ";
		Static105.aString67 = " entrou no jogo.";
		Static240.aString182 = "M";
		Static76.aString40 = "Não é possível encontrar ";
		Static219.aString139 = "qualificação: ";
		Static187.aString122 = " já está na sua lista de amigos.";
		Static190.aString123 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static230.aString147 = "M";
		Static41.aString21 = "Tela título carregada";
		Static212.aString133 = "Usar";
		Static154.aString103 = "Iniciando biblioteca 3D";
		Static25.aString7 = "Pacote de palavras carregado";
		Static95.aString60 = "Remova ";
		Static194.aString124 = "Biblioteca 3D iniciada";
		Static44.aString22 = "Conexão perdida.";
		Static173.aString112 = "Descartar";
		Static62.aString32 = "Carregando padrões - ";
		Static191.aString180 = " saiu do jogo.";
		Static125.aString79 = "deslizamento:";
		Static6.aString3 = "Gerenciador de entradas carregado";
		Static180.aString117 = "Conectando ao servidor de atualização";
		Static129.aString85 = "nível: ";
		Static129.aString86 = "Cancelar";
		Static160.aString107 = "flash1:";
		Static247.aString161 = "Fechar";
		Static51.aString29 = "Examinar";
		Static86.aString51 = "Sprites carregados";
		Static229.aString190 = "Ok";
		Static35.aString16 = "Continuar";
		Static124.aString78 = "RuneScape carregando. Aguarde...";
		Static67.aString35 = "Fontes carregadas";
		Static254.aString164 = " ";
		Static191.aString181 = "onda2:";
		Static169.aString110 = "rolagem:";
		Static80.aString42 = "Carregando config - ";
		Static83.aString131 = "Universo de jogo criado";
		Static113.aString72 = "Memória alocada";
		Static286.aString191 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static74.aString39 = "tremor:";
		Static25.aString6 = "Carregando pacote de palavras - ";
		Static101.aString163 = "brilho1:";
		Static137.aString89 = "verde:";
		Static145.aString97 = "Atacar";
		Static201.aString125 = "Objeto para membros";
		Static63.aString33 = "brilho2:";
		Static121.aString76 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static221.aString141 = " da sua lista de ignorados primeiro.";
		Static61.aString31 = "onda:";
		Static86.aString50 = "Carregando. Aguarde.";
		Static179.aString116 = "Pegar";
		Static182.aString120 = "habilidade: ";
		Static268.aString183 = "K";
		Static220.aString140 = "K";
		Static275.aString185 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static264.aString178 = "branco:";
		Static129.aString84 = "Virar para cá";
		Static97.aString63 = "Conectado ao servidor de atualização";
		Static288.aString71 = "Selecionar opção";
		Static127.aString82 = "Tentando reestabelecer conexão. Aguarde.";
		Static95.aString57 = "flash2:";
		Static198.aString70 = " mais opções";
		Static245.aString160 = "brilho3:";
		Static63.aString34 = "Carregando fontes - ";
		Static45.aString23 = "Config carregada";
		Static129.aString83 = "Remova ";
		Static275.aString186 = "Caminhar para cá";
		Static136.aString88 = "Largar";
		Static167.aString108 = " da sua lista de amigos primeiro.";
		Static243.aString158 = "roxo:";
		Static224.aString144 = "Selecionar";
		Static153.aString102 = "brilho3:";
		Static22.aString5 = "Mecanismo de som preparado";
		Static191.aString179 = "Aguarde...";
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILclient!lc;[Lclient!af;)V")
	public static void method3773(@OriginalArg(1) Class98 arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub1[] arg1) {
		Static115.aClass4_Sub2_Sub1_Sub1Array4 = arg1;
		Static244.aClass98_140 = arg0;
		Static231.aBooleanArray22 = new boolean[Static115.aClass4_Sub2_Sub1_Sub1Array4.length];
		Static48.aClass97_1.method2356();
		@Pc(21) int local21 = Static244.aClass98_140.method2376("details");
		@Pc(26) int[] local26 = Static244.aClass98_140.method2384(local21);
		for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
			Static48.aClass97_1.method2364(Static222.method3560(local26[local28], new Class4_Sub17(Static244.aClass98_140.method2396(local26[local28], local21))), (long) local26[local28]);
		}
	}
}
