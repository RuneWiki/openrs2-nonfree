import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class4_Sub4_Sub12 extends Class4_Sub4 {

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "[Lclient!v;")
	public Class76[] aClass76Array22;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "I")
	public int anInt2008;

	@OriginalMember(owner = "client!o", name = "W", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
	public int anInt2011;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Lclient!v;")
	public Class76 aClass76_878 = Static122.aClass76_1243;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "I")
	public int anInt2007 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!ne;B)V")
	public void method1419(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method599();
			if (local15 == 0) {
				return;
			}
			this.method1420(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ne;I)V")
	private void method1420(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2008 = arg0.method599();
		} else if (arg1 == 2) {
			this.anInt2001 = arg0.method599();
		} else if (arg1 == 3) {
			this.aClass76_878 = arg0.method581();
		} else if (arg1 == 4) {
			this.anInt2011 = arg0.method549();
		} else {
			@Pc(35) int local35;
			if (arg1 == 5) {
				this.anInt2007 = arg0.method604();
				this.aClass76Array22 = new Class76[this.anInt2007];
				this.anIntArray279 = new int[this.anInt2007];
				for (local35 = 0; local35 < this.anInt2007; local35++) {
					this.anIntArray279[local35] = arg0.method549();
					this.aClass76Array22[local35] = arg0.method581();
				}
			} else if (arg1 == 6) {
				this.anInt2007 = arg0.method604();
				this.anIntArray277 = new int[this.anInt2007];
				this.anIntArray279 = new int[this.anInt2007];
				for (local35 = 0; local35 < this.anInt2007; local35++) {
					this.anIntArray279[local35] = arg0.method549();
					this.anIntArray277[local35] = arg0.method549();
				}
			}
		}
	}
}
