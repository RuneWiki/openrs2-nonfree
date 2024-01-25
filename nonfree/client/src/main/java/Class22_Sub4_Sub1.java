import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public class Class22_Sub4_Sub1 extends Class22_Sub4 {

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "[Lclient!hk;")
	private static final Class101[] aClass101Array2;

	@OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
	public int anInt4005;

	@OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
	public int anInt4008;

	@OriginalMember(owner = "client!ee", name = "A", descriptor = "I")
	public int anInt4010;

	@OriginalMember(owner = "client!ee", name = "F", descriptor = "I")
	public int anInt4014;

	@OriginalMember(owner = "client!ee", name = "G", descriptor = "I")
	public int anInt4015;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "B")
	public byte aByte39 = 5;

	static {
		new Class221("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		aClass101Array2 = new Class101[32];
		@Pc(77) Class101[] local77 = Static105.method1813();
		for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
			aClass101Array2[local77[local79].anInt2534] = local77[local79];
		}
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	protected Class22_Sub4_Sub1() {
	}
}
