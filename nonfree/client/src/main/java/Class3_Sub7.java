import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class3_Sub7 extends Class3 {

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "F")
	private float aFloat115 = 0.0F;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Lclient!ln;")
	private final Class204 aClass204_5;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!qq;Lclient!ln;)V")
	public Class3_Sub7(@OriginalArg(0) Class12_Sub2 arg0, @OriginalArg(1) Class204 arg1) {
		super(arg0);
		this.aClass204_5 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.aClass204_5.method4712();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static9.aClass108_2);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
		super.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
		super.aClass12_Sub2_23.method6247(1);
		super.aClass12_Sub2_23.method6159(null);
		super.aClass12_Sub2_23.method6196(0);
		super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static466.aClass108_4);
		super.aClass12_Sub2_23.method6280(0, Static587.aClass84_6, false, true);
		super.aClass12_Sub2_23.method6234(0, Static266.aClass84_5);
		super.aClass12_Sub2_23.method6247(0);
		super.aClass12_Sub2_23.method6196(0);
		super.aClass12_Sub2_23.method6259(-16777216);
		super.aClass12_Sub2_23.method6234(0, Static135.aClass84_1);
		this.method7536();
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
	@Override
	public void method7536() {
		if (super.aClass12_Sub2_23.method6151() != 0) {
			return;
		}
		@Pc(9) Class209_Sub2 local9 = super.aClass12_Sub2_23.method6238();
		super.aClass12_Sub2_23.method6196(1);
		@Pc(19) Class209_Sub2 local19 = super.aClass12_Sub2_23.method6270();
		local19.M(local9);
		local19.method4928(0.125F, 1.0F, 0.125F);
		local19.method4932(this.aFloat115, 0.0F, 0.0F);
		super.aClass12_Sub2_23.method6162(Static261.aClass296_2);
		super.aClass12_Sub2_23.method6196(0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.aClass12_Sub2_23.method6196(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass12_Sub2_23.method6159(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass204_5.aBoolean413) {
				this.aFloat115 = (float) (super.aClass12_Sub2_23.anInt7542 % 4000) / 4000.0F;
				super.aClass12_Sub2_23.method6159(this.aClass204_5.anInterface4_1);
			} else {
				@Pc(62) int local62 = super.aClass12_Sub2_23.anInt7542 % 4000 * 16 / 4000;
				super.aClass12_Sub2_23.method6159(this.aClass204_5.anInterface8Array2[local62]);
			}
		} else if (this.aClass204_5.aBoolean413) {
			super.aClass12_Sub2_23.method6159(this.aClass204_5.anInterface4_1);
		} else {
			super.aClass12_Sub2_23.method6159(this.aClass204_5.anInterface8Array2[0]);
		}
		super.aClass12_Sub2_23.method6196(0);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		super.aClass12_Sub2_23.method6159(arg0);
	}
}
