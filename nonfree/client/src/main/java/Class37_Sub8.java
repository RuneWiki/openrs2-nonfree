import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class37_Sub8 extends Class37 {

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "F")
	private float aFloat188 = 0.0F;

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "Lclient!ie;")
	private final Class149 aClass149_6;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!fo;Lclient!ie;)V")
	public Class37_Sub8(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) Class149 arg1) {
		super(arg0);
		this.aClass149_6 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static477.aClass238_4);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return this.aClass149_6.method3987();
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		super.aClass9_Sub3_19.method5482(1);
		super.aClass9_Sub3_19.method5598(Static477.aClass238_4, Static477.aClass238_4);
		super.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
		super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
		super.aClass9_Sub3_19.method5589(1);
		super.aClass9_Sub3_19.method5494(null);
		super.aClass9_Sub3_19.method5482(0);
		super.aClass9_Sub3_19.method5543(Static503.aClass50_4, 0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
		super.aClass9_Sub3_19.method5494(arg1);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass9_Sub3_19.method5482(1);
		if ((arg0 & 0x80) != 0) {
			super.aClass9_Sub3_19.method5494(null);
		} else if ((arg1 & 0x1) == 1) {
			if (this.aClass149_6.aBoolean367) {
				this.aFloat188 = (float) (super.aClass9_Sub3_19.anInt6563 % 4000) / 4000.0F;
				super.aClass9_Sub3_19.method5494(this.aClass149_6.anInterface19_1);
			} else {
				@Pc(39) int local39 = super.aClass9_Sub3_19.anInt6563 % 4000 * 16 / 4000;
				super.aClass9_Sub3_19.method5494(this.aClass149_6.anInterface1Array2[local39]);
			}
		} else if (this.aClass149_6.aBoolean367) {
			super.aClass9_Sub3_19.method5494(this.aClass149_6.anInterface19_1);
		} else {
			super.aClass9_Sub3_19.method5494(this.aClass149_6.anInterface1Array2[0]);
		}
		super.aClass9_Sub3_19.method5482(0);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_19.method5482(1);
		super.aClass9_Sub3_19.method5598(Static410.aClass238_3, Static167.aClass238_2);
		super.aClass9_Sub3_19.method5491(false, true, Static503.aClass50_4, 0);
		super.aClass9_Sub3_19.method5543(Static49.aClass50_1, 0);
		super.aClass9_Sub3_19.method5589(0);
		super.aClass9_Sub3_19.method5482(0);
		super.aClass9_Sub3_19.method5536(-16777216);
		super.aClass9_Sub3_19.method5543(Static140.aClass50_2, 0);
		this.method7555();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V")
	@Override
	public void method7555() {
		if (super.aClass9_Sub3_19.method5478() != 0) {
			return;
		}
		@Pc(13) Class8_Sub3 local13 = super.aClass9_Sub3_19.method5484();
		super.aClass9_Sub3_19.method5482(1);
		@Pc(23) Class8_Sub3 local23 = super.aClass9_Sub3_19.method5553();
		local23.la(local13);
		local23.method8192(0.125F, 0.125F, 1.0F);
		local23.method8195(this.aFloat188, 0.0F, 0.0F);
		super.aClass9_Sub3_19.method5481(Static155.aClass340_12);
		super.aClass9_Sub3_19.method5482(0);
	}
}
