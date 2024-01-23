import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class44 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
	public int anInt1339;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!ei", name = "q", descriptor = "Z")
	public boolean aBoolean93 = false;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IBZ)Lclient!lb;")
	public Class46_Sub1 method1107(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(25) Class46_Sub1 local25 = (Class46_Sub1) Static271.aClass89_43.method2268((long) ((arg1 ? 262144 : 0) | arg0 << 16 | this.anInt1339));
		if (local25 != null) {
			return local25;
		}
		Static102.aClass168_27.method4038(this.anInt1339);
		local25 = Static119.method1931(Static102.aClass168_27, this.anInt1339);
		if (local25 != null) {
			local25.method2472(Static240.anInt5001, Static271.anInt5428, Static112.anInt2461);
			local25.anInt4747 = local25.anInt4751;
			local25.anInt4745 = local25.anInt4753;
			if (arg1) {
				local25.method2482();
			}
			for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
				local25.method2473();
			}
			Static271.aClass89_43.method2272((long) (this.anInt1339 | arg0 << 16 | (arg1 ? 262144 : 0)), local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!qm;BI)V")
	public void method1108(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method2199();
			if (local15 == 0) {
				return;
			}
			this.method1111(local15, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILclient!qm;I)V")
	private void method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt1339 = arg2.method2244();
		} else if (arg0 == 2) {
			this.anInt1341 = arg2.method2215();
		} else if (arg0 == 3) {
			this.aBoolean93 = true;
		} else if (arg0 == 4) {
			this.anInt1339 = -1;
		}
	}
}
