import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class8_Sub2_Sub3 extends Class8_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!qe", name = "E", descriptor = "[J")
	public static final long[] aLongArray7 = new long[256];

	@OriginalMember(owner = "client!qe", name = "s", descriptor = "Lclient!qd;")
	public Class8_Sub2 aClass8_Sub2_3;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray7[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIILclient!qd;)V")
	public Class8_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class8_Sub2 arg5) {
		super(arg2, arg3, arg4, Static272.method3620(arg1, arg0));
		this.aClass8_Sub2_3 = arg5;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5602() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I")
	@Override
	public int method5603() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5873() {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	@Override
	public Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	@Override
	public int method5600() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ya;II)Z")
	@Override
	public boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
	@Override
	public void method5879() {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5601(@OriginalArg(1) Class135 arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	@Override
	public Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1) {
		return null;
	}

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I")
	@Override
	public int method5606() {
		return 0;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ya;I)V")
	@Override
	public void method5877(@OriginalArg(0) Class135 arg0) {
	}

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
	@Override
	public void method5607() {
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	@Override
	public void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5) {
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILclient!ya;)V")
	@Override
	public void method5605(@OriginalArg(1) Class135 arg0) {
	}
}
