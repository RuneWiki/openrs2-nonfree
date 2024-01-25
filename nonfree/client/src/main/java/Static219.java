import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!o", name = "H", descriptor = "I")
	public static int anInt4043;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "I")
	public static int anInt4046;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	public static int anInt4049 = 0;

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)Lclient!nd;")
	public static Class6_Sub2_Sub13 method3902(@OriginalArg(0) int arg0) {
		@Pc(10) Class6_Sub2_Sub13 local10 = (Class6_Sub2_Sub13) Static82.aClass31_3.method634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static192.aClass53_95.method1033(arg0, 11);
		local10 = new Class6_Sub2_Sub13();
		if (local22 != null) {
			local10.method3706(new Class6_Sub10(local22));
		}
		Static82.aClass31_3.method632((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
	public static void method3903() {
		if (Static109.anInt2025 == 0) {
			return;
		}
		try {
			if (++Static155.anInt5413 > 1500) {
				if (Static216.aClass11_5 != null) {
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
				}
				if (Static226.anInt4217 >= 1) {
					Static24.anInt400 = -5;
					Static109.anInt2025 = 0;
					return;
				}
				Static109.anInt2025 = 1;
				Static155.anInt5413 = 0;
				Static226.anInt4217++;
				if (Static137.anInt2483 == Static240.anInt4008) {
					Static137.anInt2483 = Static203.anInt3732;
				} else {
					Static137.anInt2483 = Static240.anInt4008;
				}
			}
			if (Static109.anInt2025 == 1) {
				Static173.aClass196_4 = Static308.aClass206_5.method5525(Static137.anInt2483, Static133.aString102);
				Static109.anInt2025 = 2;
			}
			@Pc(117) int local117;
			if (Static109.anInt2025 == 2) {
				if (Static173.aClass196_4.anInt5851 == 2) {
					throw new IOException();
				}
				if (Static173.aClass196_4.anInt5851 != 1) {
					return;
				}
				Static216.aClass11_5 = new Class11((Socket) Static173.aClass196_4.anObject8, Static308.aClass206_5);
				Static173.aClass196_4 = null;
				Static216.aClass11_5.method158(Static131.aClass6_Sub10_Sub1_2.aByteArray67, Static131.aClass6_Sub10_Sub1_2.anInt4188);
				if (Static292.aClass34_1 != null) {
					Static292.aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				local117 = Static216.aClass11_5.method167();
				if (Static292.aClass34_1 != null) {
					Static292.aClass34_1.method5831();
				}
				if (Static326.aClass34_2 != null) {
					Static326.aClass34_2.method5831();
				}
				if (local117 != 101) {
					Static109.anInt2025 = 0;
					Static24.anInt400 = local117;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
					return;
				}
				Static109.anInt2025 = 3;
			}
			if (Static109.anInt2025 == 3 && Static216.aClass11_5.method160() >= 2) {
				local117 = Static216.aClass11_5.method167() << 8 | Static216.aClass11_5.method167();
				Static226.method4029(local117);
				if (Static181.anInt3403 == -1) {
					Static24.anInt400 = 6;
					Static109.anInt2025 = 0;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
				} else {
					Static109.anInt2025 = 0;
					Static216.aClass11_5.method159();
					Static216.aClass11_5 = null;
					Static75.method1311();
				}
			}
		} catch (@Pc(195) IOException local195) {
			if (Static216.aClass11_5 != null) {
				Static216.aClass11_5.method159();
				Static216.aClass11_5 = null;
			}
			if (Static226.anInt4217 >= 1) {
				Static109.anInt2025 = 0;
				Static24.anInt400 = -4;
			} else {
				Static226.anInt4217++;
				Static155.anInt5413 = 0;
				Static109.anInt2025 = 1;
				if (Static240.anInt4008 == Static137.anInt2483) {
					Static137.anInt2483 = Static203.anInt3732;
				} else {
					Static137.anInt2483 = Static240.anInt4008;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(ZI)I")
	public static int method3904(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
	public static void method3905() {
		Static47.aString37 = "Memória alocada";
		Static269.aString215 = "deslizamento:";
		Static299.aString255 = "nível: ";
		Static294.aString247 = "K";
		Static284.aString230 = "M";
		Static84.aString55 = "qualificação: ";
		Static252.aString198 = "Pacote de palavras carregado";
		Static17.aString299 = " da sua lista de amigos primeiro.";
		Static292.aString244 = "Texturas carregadas";
		Static354.aString307 = "Carregando dados da lista de mundos";
		Static209.aString164 = "Alocando memória";
		Static3.aString3 = "Conectando ao servidor de atualização";
		Static277.aString226 = "Carregando pacote de palavras - ";
		Static196.aString156 = "onda:";
		Static334.aString295 = "RuneScape carregando. Aguarde...";
		Static1.aString1 = "Virar para cá";
		Static125.aString93 = "Conexão perdida.";
		Static113.aString84 = "brilho1:";
		Static165.aString287 = "Usar";
		Static142.aString112 = "Iniciando biblioteca 3D";
		Static41.aString308 = "Tentando reestabelecer conexão. Aguarde.";
		Static86.aString57 = "Fontes carregadas";
		Static153.aString126 = "Examinar";
		Static54.aString43 = "Config carregada";
		Static323.aString277 = "Tela título aberta";
		Static283.aString227 = "Carregando config - ";
		Static180.aString166 = "amarelo:";
		Static164.aString128 = " já está na sua lista de amigos.";
		Static338.aString298 = "K";
		Static316.aString271 = "Aguarde...";
		Static301.aString260 = "Carregando padrões - ";
		Static239.aString305 = "Fechar";
		Static150.aString121 = "Selecionar opção";
		Static255.aString199 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
		Static296.aString279 = "tremor:";
		Static44.aString36 = "verde:";
		Static275.aString221 = "brilho3:";
		Static286.aString232 = "Continuar";
		Static108.aString78 = "Carregando interfaces - ";
		Static309.aString268 = "Oculto";
		Static95.aString63 = "Pegar";
		Static117.aString89 = "Verificando atualizações - ";
		Static340.aString26 = "Objeto para membros";
		Static141.aString107 = "Padrões carregados";
		Static141.aString109 = "Sprites carregados";
		Static204.aString160 = "flash2:";
		Static76.aString123 = "Biblioteca 3D iniciada";
		Static273.aString296 = "Tela título carregada";
		Static302.aString263 = "Você não pode adicionar a si próprio à sua lista de amigos.";
		Static174.aString138 = "Conectado ao servidor de atualização";
		Static59.aString45 = "branco:";
		Static288.aString237 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
		Static241.aString274 = "Não é possível encontrar ";
		Static256.aString200 = "Universo de jogo criado";
		Static186.aString143 = "Dados da lista de mundos carregados";
		Static312.aString269 = "Mechscape carregando. Aguarde...";
		Static271.aString214 = "Carregando texturas - ";
		Static171.aString133 = "Carregando. Aguarde.";
		Static209.aString165 = " entrou no jogo.";
		Static294.aString248 = "As variáveis do sistema foram carregadas";
		Static110.aString81 = "Carregando...";
		Static40.aString33 = "Descartar";
		Static127.aString182 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
		Static217.aString172 = " saiu do jogo.";
		Static318.aString273 = "flash1:";
		Static189.aString152 = "Lista de atualizações carregada";
		Static40.aString32 = "Cancelar";
		Static295.aString252 = "Caminhar para cá";
		Static43.aString35 = "Interfaces carregadas";
		Static306.aString265 = "roxo:";
		Static68.aString179 = " da sua lista de ignorados primeiro.";
		Static184.aString142 = " ";
		Static218.aString173 = "Ok";
		Static155.aString236 = "brilho3:";
		Static217.aString171 = "M";
		Static337.aString297 = "Remova ";
		Static351.aString303 = "Selecionar";
		Static141.aString106 = "rolagem:";
		Static128.aString97 = "Carregando tela título - ";
		Static108.aString77 = "Atacar";
		Static267.aString211 = "Largar";
		Static88.aString59 = "vermelho:";
		Static5.aString8 = "onda2:";
		Static82.aString54 = "Remova ";
		Static291.aString241 = "Gerenciador de entradas carregado";
		Static275.aString223 = "Carregando fontes - ";
		Static80.aString259 = "cyan:";
		Static12.aString13 = "brilho2:";
		Static141.aString108 = " já está na sua lista de ignorados.";
		Static239.aString306 = "habilidade: ";
		Static120.aString92 = "Mecanismo de som preparado";
		Static275.aString222 = " mais opções";
		Static200.aString157 = "Carregando sprites - ";
	}
}
