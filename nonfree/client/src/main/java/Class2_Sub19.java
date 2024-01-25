import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class2_Sub19 extends Class2 {

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "[Lclient!bf;")
	private static final Class34[] aClass34Array1 = new Class34[32];

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public final int anInt3087;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public final int anInt3092;

	static {
		@Pc(81) Class34[] local81 = Static320.method4907();
		for (@Pc(83) int local83 = 0; local83 < local81.length; local83++) {
			aClass34Array1[local81[local83].anInt808] = local81[local83];
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3087 = arg0;
		this.anInt3092 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z")
	public boolean method2648() {
		return (this.anInt3087 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
	public boolean method2649(@OriginalArg(0) int arg0) {
		return (this.anInt3087 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
	public int method2650() {
		return Static458.method4356(this.anInt3087);
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)I")
	public int method2652() {
		return this.anInt3087 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Z)Z")
	public boolean method2654() {
		return (this.anInt3087 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Z")
	public boolean method2655() {
		return (this.anInt3087 >> 21 & 0x1) != 0;
	}
}
