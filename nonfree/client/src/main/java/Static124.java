import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt2374;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!gi;")
	public static Class64 aClass64_16 = new Class64(64);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BI)V")
	public static void method1915(@OriginalArg(1) int arg0) {
		Static93.anInt1771 = arg0;
		Static274.method4188(3);
		Static274.method4188(4);
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
	public static void method1917() {
		Static29.aString20 = "Carregando sprites - ";
		Static152.aString98 = "qualificação: ";
		Static268.aString180 = "Remova ";
		Static1.aString1 = "onda:";
		Static37.aString102 = " da sua lista de ignorados primeiro.";
		Static290.aString188 = "Remova ";
		Static53.aString29 = "Carregando dados da lista de mundos";
		Static246.aString116 = "rolagem:";
		Static109.aString63 = "Ok";
		Static64.aString35 = "Fechar";
		Static260.aString177 = "brilho2:";
		Static192.aString181 = "Verificando atualizações - ";
		Static128.aString85 = "onda2:";
		Static52.aString28 = "M";
		Static260.aString178 = "Sprites carregados";
		Static73.aString42 = "Atacar";
		Static103.aString62 = " entrou no jogo.";
		Static103.aString61 = "Biblioteca 3D iniciada";
		Static131.aString87 = "Tela título aberta";
		Static260.aString176 = "Pegar";
		Static68.aString153 = "vermelho:";
		Static122.aString73 = "Interfaces carregadas";
		Static139.aString89 = "brilho3:";
		Static62.aString33 = "tremor:";
		Static211.aString25 = "Aguarde...";
		Static3.aString3 = "Conectando ao servidor de atualização";
		Static230.aString155 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static73.aString41 = "deseja negociar com você.";
		Static137.aString136 = " mais opções";
		Static290.aString189 = "roxo:";
		Static89.aString48 = "Gerenciador de entradas carregado";
		Static175.aString111 = "Carregando pacote de palavras - ";
		Static4.aString5 = "Config carregada";
		Static140.aString91 = "Alocando memória";
		Static167.aString105 = " já está na sua lista de ignorados.";
		Static16.aString16 = "Continuar";
		Static247.aString166 = "Carregando /secure/libs_v4s/RCras - ";
		Static5.aString7 = "deslizamento:";
		Static3.aString2 = "Lista de atualizações carregada";
		Static38.aString23 = "Virar para cá";
		Static145.aString94 = "Carregando interfaces - ";
		Static203.aString138 = "brilho1:";
		Static12.aString14 = "flash1:";
		Static145.aString93 = "Caminhar para cá";
		Static143.aString92 = "Dados da lista de mundos carregados";
		Static221.aString148 = " ";
		Static177.aString112 = "K";
		Static100.aString56 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static126.aString77 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static102.aString60 = "habilidade: ";
		Static125.aString75 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static163.aString151 = " saiu do jogo.";
		Static288.aString186 = "Objeto para membros";
		Static179.aString114 = "Examinar";
		Static289.aString187 = "Descartar";
		Static126.aString76 = "Conexão perdida.";
		Static139.aString90 = "Mecanismo de som preparado";
		Static294.aString191 = "brilho3:";
		Static234.aString160 = "Selecionar";
		Static79.aString101 = "flash2:";
		Static9.aString11 = "Oculto";
		Static233.aString158 = "Iniciando biblioteca 3D";
		Static191.aString131 = "K";
		Static167.aString104 = "Selecionar opção";
		Static90.aString152 = "verde:";
		Static174.aString110 = "Cancelar";
		Static131.aString86 = "Carregando config - ";
		Static251.aString174 = "RuneScape carregando. Aguarde...";
		Static95.aString54 = "Fontes carregadas";
		Static89.aString49 = "nível: ";
		Static220.aString146 = "Texturas carregadas";
		Static291.aString190 = "branco:";
		Static277.aString185 = "cyan:";
		Static100.aString57 = " da sua lista de amigos primeiro.";
		Static101.aString58 = "M";
		Static182.aString117 = "Não é possível encontrar ";
		Static9.aString10 = "Memória alocada";
		Static169.aString106 = "Carregando tela título - ";
		Static189.aString121 = " já está na sua lista de amigos.";
		Static10.aString13 = "Pacote de palavras carregado";
		Static10.aString12 = "Padrões carregados";
		Static14.aString15 = "Tentando reestabelecer conexão. Aguarde.";
		Static86.aString45 = "Tela título carregada";
		Static189.aString120 = "Carregando fontes - ";
		Static149.aString96 = "Usar";
		Static123.aString74 = "Universo de jogo criado";
		Static71.aString40 = "Conectado ao servidor de atualização";
		Static4.aString6 = "Carregando. Aguarde.";
		Static219.aString144 = "amarelo:";
		Static45.aString26 = "Carregando...";
		Static22.aString173 = "Largar";
		Static46.aString27 = "Carregando padrões - ";
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZIIB)Ljava/lang/String;")
	public static String method1918(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(49) int local49 = arg0 / 10;
		@Pc(51) int local51 = 2;
		while (local49 != 0) {
			local51++;
			local49 /= 10;
		}
		@Pc(66) char[] local66 = new char[local51];
		local66[0] = '+';
		for (@Pc(74) int local74 = local51 - 1; local74 > 0; local74--) {
			@Pc(78) int local78 = arg0;
			arg0 /= 10;
			@Pc(89) int local89 = local78 - arg0 * 10;
			if (local89 < 10) {
				local66[local74] = (char) (local89 + 48);
			} else {
				local66[local74] = (char) (local89 + 87);
			}
		}
		return new String(local66);
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIII)I")
	public static int method1919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static163.anIntArrayArrayArray16 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg2 >> 7;
		if (local11 < 0 || local15 < 0 || local11 > 103 || local15 > 103) {
			return 0;
		}
		@Pc(42) int local42 = arg1 & 0x7F;
		@Pc(44) int local44 = arg0;
		if (arg0 < 3 && (Static242.aByteArrayArrayArray23[1][local11][local15] & 0x2) == 2) {
			local44 = arg0 + 1;
		}
		@Pc(64) int local64 = arg2 & 0x7F;
		@Pc(91) int local91 = local42 * Static163.anIntArrayArrayArray16[local44][local11 + 1][local15] + (128 - local42) * Static163.anIntArrayArrayArray16[local44][local11][local15] >> 7;
		@Pc(122) int local122 = local42 * Static163.anIntArrayArrayArray16[local44][local11 + 1][local15 + 1] + Static163.anIntArrayArrayArray16[local44][local11][local15 + 1] * (128 - local42) >> 7;
		return local91 * (128 - local64) + local122 * local64 >> 7;
	}
}
