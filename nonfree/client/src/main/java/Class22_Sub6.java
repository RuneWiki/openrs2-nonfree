import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class22_Sub6 extends Class22 {

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[J")
	public static final long[] aLongArray6 = new long[256];

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(16) long local16 = (long) local12;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1L) == 1L) {
					local16 = local16 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local16 >>>= 0x1;
				}
			}
			aLongArray6[local12] = local16;
		}
	}

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class22_Sub6(@OriginalArg(0) Class51_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method4101(@OriginalArg(0) boolean arg0) {
		super.aClass51_Sub2_33.method5366(true);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!ew;I)V")
	@Override
	public void method4100(@OriginalArg(1) Class59 arg0, @OriginalArg(2) int arg1) {
		super.aClass51_Sub2_33.method5364(arg0);
		super.aClass51_Sub2_33.method5400(arg1);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	@Override
	public void method4104(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4106() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
	@Override
	public void method4099(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	@Override
	public void method4103() {
		super.aClass51_Sub2_33.method5366(false);
	}
}
