import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class42_Sub3 extends Class42 {

	@OriginalMember(owner = "client!hg", name = "n", descriptor = "F")
	private float aFloat47 = 0.0F;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Lclient!pv;")
	private final Class241 aClass241_2;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!re;Lclient!pv;)V")
	public Class42_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) Class241 arg1) {
		super(arg0);
		this.aClass241_2 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILclient!sw;)V")
	@Override
	public void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass122_Sub2_16.method5651(arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6429(@OriginalArg(1) boolean arg0) {
		super.aClass122_Sub2_16.method5644(1);
		super.aClass122_Sub2_16.method5605(Static39.aClass271_1, Static486.aClass271_5);
		super.aClass122_Sub2_16.method5678(Static162.aClass181_2, false, true, 0);
		super.aClass122_Sub2_16.method5585(Static295.aClass181_3, 0);
		super.aClass122_Sub2_16.method5626(0);
		super.aClass122_Sub2_16.method5644(0);
		super.aClass122_Sub2_16.method5634(-16777216);
		super.aClass122_Sub2_16.method5585(Static312.aClass181_4, 0);
		this.method6435();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6432(@OriginalArg(0) boolean arg0) {
		super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static486.aClass271_5);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	@Override
	public void method6435() {
		if (super.aClass122_Sub2_16.method5680() != 0) {
			return;
		}
		@Pc(17) Class118_Sub3 local17 = super.aClass122_Sub2_16.method5553();
		super.aClass122_Sub2_16.method5644(1);
		@Pc(27) Class118_Sub3 local27 = super.aClass122_Sub2_16.method5574();
		local27.EA(local17);
		local27.method6972(0.125F, 1.0F, 0.125F);
		local27.method6985(0.0F, 0.0F, this.aFloat47);
		super.aClass122_Sub2_16.method5612(Static455.aClass110_6);
		super.aClass122_Sub2_16.method5644(0);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)V")
	@Override
	public void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		super.aClass122_Sub2_16.method5644(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass122_Sub2_16.method5651(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass241_2.aBoolean500) {
				this.aFloat47 = (float) (super.aClass122_Sub2_16.anInt6721 % 4000) / 4000.0F;
				super.aClass122_Sub2_16.method5651(this.aClass241_2.anInterface9_1);
			} else {
				@Pc(78) int local78 = super.aClass122_Sub2_16.anInt6721 % 4000 * 16 / 4000;
				super.aClass122_Sub2_16.method5651(this.aClass241_2.anInterface3Array2[local78]);
			}
		} else if (this.aClass241_2.aBoolean500) {
			super.aClass122_Sub2_16.method5651(this.aClass241_2.anInterface9_1);
		} else {
			super.aClass122_Sub2_16.method5651(this.aClass241_2.anInterface3Array2[0]);
		}
		super.aClass122_Sub2_16.method5644(0);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	@Override
	public void method6424() {
		super.aClass122_Sub2_16.method5644(1);
		super.aClass122_Sub2_16.method5605(Static449.aClass271_4, Static449.aClass271_4);
		super.aClass122_Sub2_16.method5575(0, Static162.aClass181_2);
		super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
		super.aClass122_Sub2_16.method5626(1);
		super.aClass122_Sub2_16.method5651(null);
		super.aClass122_Sub2_16.method5644(0);
		super.aClass122_Sub2_16.method5585(Static162.aClass181_2, 0);
	}

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6433() {
		return this.aClass241_2.method5765();
	}
}
