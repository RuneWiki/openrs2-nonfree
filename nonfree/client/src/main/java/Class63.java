import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cia")
public final class Class63 {

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
	public int anInt1113;

	@OriginalMember(owner = "client!cia", name = "g", descriptor = "Lclient!vf;")
	public Class365 aClass365_3;

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "I")
	public int anInt1120;

	@OriginalMember(owner = "client!cia", name = "n", descriptor = "Z")
	public boolean aBoolean85 = false;

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(BLclient!mc;I)V")
	private void method1013(@OriginalArg(1) Class5_Sub41 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1113 = arg0.method7860();
		} else if (arg1 == 2) {
			this.anInt1120 = arg0.method7807();
		} else if (arg1 == 3) {
			this.aBoolean85 = true;
		} else if (arg1 == 4) {
			this.anInt1113 = -1;
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)Z")
	public boolean method1016() {
		return this.aClass365_3.aClass390_121.method8905(this.anInt1113);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(Lclient!ha;IZB)Lclient!pu;")
	public Class50 method1017(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) long local22 = (long) ((arg2 ? 262144 : 0) | this.anInt1113 | arg1 << 16 | arg0.anInt8116 << 19);
		@Pc(35) Class50 local35 = (Class50) this.aClass365_3.aClass340_63.method7999(local22);
		if (local35 != null) {
			return local35;
		} else if (this.aClass365_3.aClass390_121.method8905(this.anInt1113)) {
			@Pc(57) Class369 local57 = Static689.method8541(this.aClass365_3.aClass390_121, this.anInt1113, 0);
			if (local57 != null) {
				local57.anInt10310 = local57.anInt10308 = local57.anInt10311 = local57.anInt10306 = 0;
				if (arg2) {
					local57.method8547();
				}
				for (@Pc(77) int local77 = 0; local77 < arg1; local77++) {
					local57.method8544();
				}
			}
			local35 = arg0.method6898(local57, true);
			if (local35 != null) {
				this.aClass365_3.aClass340_63.method7986(local22, local35);
			}
			return local35;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(ILclient!mc;)V")
	public void method1019(@OriginalArg(1) Class5_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method7816();
			if (local3 == 0) {
				return;
			}
			this.method1013(arg0, local3);
		}
	}
}
