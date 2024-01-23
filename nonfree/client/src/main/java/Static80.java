import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	public static int anInt2170;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "[[Lclient!se;")
	public static Class122[][] aClass122ArrayArray1;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
	public static int anInt2172 = 0;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	public static int anInt2174 = 5063219;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString132 = "Loaded textures";

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Ljava/lang/String;ZC)I")
	public static int method1627(@OriginalArg(0) String arg0) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0.charAt(local17) == '<') {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
	public static void method1628() {
		Static49.aString79 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static61.aString99 = "Sprites carregados";
		Static97.aString231 = "brilho3:";
		Static194.aString293 = "Ok";
		Static171.aString265 = "Remova ";
		Static253.aString244 = "Virar para cá";
		Static20.aString29 = "Interfaces carregadas";
		Static107.aString184 = "Iniciando biblioteca 3D";
		Static143.aString224 = "Carregando interfaces - ";
		Static87.aString153 = "Tentando reestabelecer conexão. Aguarde.";
		Static237.aString366 = "Remova ";
		aString132 = "Texturas carregadas";
		Static209.aString320 = "Mecanismo de som preparado";
		Static8.aString9 = "Carregando /secure/libs_v4s/RCras - ";
		Static88.aString155 = "Carregando pacote de palavras - ";
		Static133.aString213 = "Padrões carregados";
		Static181.aString279 = "cyan:";
		Static187.aString281 = "Carregando...";
		Static82.aString136 = "M";
		Static264.aString391 = "Carregando fontes - ";
		Static14.aString16 = "K";
		Static65.aString107 = "Fechar";
		Static98.aString173 = "Tela título carregada";
		Static18.aString24 = "Aguarde...";
		Static99.aString174 = "flash1:";
		Static224.aString351 = "habilidade: ";
		Static87.aString154 = " da sua lista de ignorados primeiro.";
		Static191.aString287 = "onda:";
		Static197.aString145 = "Carregando padrões - ";
		Static238.aString369 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static128.aString206 = "Caminhar para cá";
		Static165.aString253 = "nível: ";
		Static111.aString188 = "deslizamento:";
		Static200.aString297 = "Carregando tela título - ";
		Static113.aString389 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static222.aString345 = "rolagem:";
		Static209.aString321 = "Universo de jogo criado";
		Static133.aString212 = "K";
		Static81.aString133 = "Fontes carregadas";
		Static16.aString354 = "Selecionar opção";
		Static151.aString234 = " entrou no jogo.";
		Static131.aString52 = "Atacar";
		Static101.aString175 = "flash2:";
		Static112.aString189 = "amarelo:";
		Static113.aString390 = "Verificando atualizações - ";
		Static208.aString319 = "Examinar";
		Static28.aString39 = " saiu do jogo.";
		Static140.aString219 = "verde:";
		Static121.aString195 = "Selecionar";
		Static172.aString266 = "Gerenciador de entradas carregado";
		Static213.aString328 = "Conectando ao servidor de atualização";
		Static36.aString31 = " ";
		Static127.aString204 = "Alocando memória";
		Static186.aString280 = "onda2:";
		Static197.aString146 = "Usar";
		Static128.aString205 = "Config carregada";
		Static161.aString242 = "Não é possível encontrar ";
		Static158.aString241 = "qualificação: ";
		Static170.aString262 = "Biblioteca 3D iniciada";
		Static35.aString45 = "Oculto";
		Static77.aString129 = "vermelho:";
		Static259.aString386 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static247.aString376 = "Pegar";
		Static238.aString368 = "Lista de atualizações carregada";
		Static207.aString312 = "roxo:";
		Static157.aString240 = " já está na sua lista de amigos.";
		Static205.aString310 = "Pacote de palavras carregado";
		Static47.aString78 = "Cancelar";
		Static193.aString290 = "branco:";
		Static183.aString370 = "Carregando config - ";
		Static137.aString215 = "Dados da lista de mundos carregados";
		Static208.aString318 = "Descartar";
		Static136.aString218 = "Carregando. Aguarde.";
		Static67.aString110 = "brilho2:";
		Static208.aString316 = "RuneScape carregando. Aguarde...";
		Static86.aString152 = "Carregando sprites - ";
		Static11.aString14 = "Objeto para membros";
		Static109.aString185 = " já está na sua lista de ignorados.";
		Static70.aString116 = "brilho3:";
		Static129.aString209 = "Continuar";
		Static125.aString201 = "tremor:";
		Static26.aString28 = "Largar";
		Static93.aString165 = "Conexão perdida.";
		Static164.aString248 = "deseja negociar com você.";
		Static168.aString257 = " da sua lista de amigos primeiro.";
		Static125.aString200 = "M";
		Static34.aString44 = "Tela título aberta";
		Static209.aString322 = "Conectado ao servidor de atualização";
		Static204.aString307 = "brilho1:";
		Static150.aString252 = "Memória alocada";
		Static205.aString311 = "Carregando dados da lista de mundos";
		Static238.aString367 = " mais opções";
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	public static boolean method1629(@OriginalArg(2) String arg0) {
		@Pc(26) int local26 = 0;
		@Pc(28) boolean local28 = false;
		@Pc(30) boolean local30 = false;
		@Pc(33) int local33 = arg0.length();
		for (@Pc(35) int local35 = 0; local35 < local33; local35++) {
			@Pc(41) char local41 = arg0.charAt(local35);
			if (local35 == 0) {
				if (local41 == '-') {
					local30 = true;
					continue;
				}
				if (local41 == '+') {
					continue;
				}
			}
			@Pc(81) int local81;
			if (local41 >= '0' && local41 <= '9') {
				local81 = local41 - '0';
			} else if (local41 >= 'A' && local41 <= 'Z') {
				local81 = local41 - '7';
			} else if (local41 >= 'a' && local41 <= 'z') {
				local81 = local41 - 'W';
			} else {
				return false;
			}
			if (local81 >= 10) {
				return false;
			}
			if (local30) {
				local81 = -local81;
			}
			@Pc(113) int local113 = local81 + local26 * 10;
			if (local113 / 10 != local26) {
				return false;
			}
			local26 = local113;
			local28 = true;
		}
		return local28;
	}
}
