import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class42_Sub9 extends Class42 {

	@OriginalMember(owner = "client!st", name = "r", descriptor = "Z")
	private boolean aBoolean554 = false;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class42_Sub9(@OriginalArg(0) Class122_Sub2 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass122_Sub2_16.method5651(arg1);
		super.aClass122_Sub2_16.method5561(arg0);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static486.aClass271_5);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		@Pc(15) Interface7 local15 = super.aClass122_Sub2_16.method5677();
		if (local15 == null || !arg0) {
			super.aClass122_Sub2_16.method5585(Static30.aClass181_1, 0);
			return;
		}
		super.aClass122_Sub2_16.method5644(1);
		super.aClass122_Sub2_16.method5651(local15);
		super.aClass122_Sub2_16.method5655(Static469.aClass79_13);
		super.aClass122_Sub2_16.method5644(1);
		super.aClass122_Sub2_16.method5605(Static343.aClass271_2, Static486.aClass271_5);
		super.aClass122_Sub2_16.method5678(Static295.aClass181_3, false, true, 2);
		super.aClass122_Sub2_16.method5585(Static30.aClass181_1, 0);
		@Pc(68) Class118_Sub3 local68 = super.aClass122_Sub2_16.method5574();
		local68.method6988(super.aClass122_Sub2_16.method5559());
		super.aClass122_Sub2_16.method5612(Static132.aClass110_3);
		super.aClass122_Sub2_16.method5644(0);
		this.aBoolean554 = true;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		if (this.aBoolean554) {
			super.aClass122_Sub2_16.method5644(1);
			super.aClass122_Sub2_16.method5655(Static193.aClass79_11);
			super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
			super.aClass122_Sub2_16.method5575(2, Static312.aClass181_4);
			super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
			super.aClass122_Sub2_16.method5614();
			super.aClass122_Sub2_16.method5651(null);
			super.aClass122_Sub2_16.method5644(0);
			this.aBoolean554 = false;
		} else {
			super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
		}
		super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return true;
	}
}
