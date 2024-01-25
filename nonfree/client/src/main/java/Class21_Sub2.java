import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class21_Sub2 extends Class21 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "F")
	private float aFloat77 = 0.0F;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!paa;")
	private final Class236 aClass236_3;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!wr;Lclient!paa;)V")
	public Class21_Sub2(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) Class236 arg1) {
		super(arg0);
		this.aClass236_3 = arg1;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return this.aClass236_3.method5705();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aClass42_Sub1_19.method5915(1);
		if ((arg1 & 0x80) != 0) {
			super.aClass42_Sub1_19.method5868(null);
		} else if ((arg0 & 0x1) == 1) {
			if (this.aClass236_3.aBoolean493) {
				this.aFloat77 = (float) (super.aClass42_Sub1_19.anInt7105 % 4000) / 4000.0F;
				super.aClass42_Sub1_19.method5868(this.aClass236_3.anInterface17_1);
			} else {
				@Pc(61) int local61 = super.aClass42_Sub1_19.anInt7105 % 4000 * 16 / 4000;
				super.aClass42_Sub1_19.method5868(this.aClass236_3.anInterface20Array1[local61]);
			}
		} else if (this.aClass236_3.aBoolean493) {
			super.aClass42_Sub1_19.method5868(this.aClass236_3.anInterface17_1);
		} else {
			super.aClass42_Sub1_19.method5868(this.aClass236_3.anInterface20Array1[0]);
		}
		super.aClass42_Sub1_19.method5915(0);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub1_19.method5868(arg0);
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	@Override
	public void method7554() {
		if (super.aClass42_Sub1_19.method5922() != 0) {
			return;
		}
		@Pc(22) Class91_Sub2 local22 = super.aClass42_Sub1_19.method5975();
		super.aClass42_Sub1_19.method5915(1);
		@Pc(32) Class91_Sub2 local32 = super.aClass42_Sub1_19.method5903();
		local32.EA(local22);
		local32.method5491(0.125F, 1.0F, 0.125F);
		local32.method5510(0.0F, this.aFloat77, 0.0F);
		super.aClass42_Sub1_19.method5918(Static436.aClass299_6);
		super.aClass42_Sub1_19.method5915(0);
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		super.aClass42_Sub1_19.method5915(1);
		super.aClass42_Sub1_19.method5945(Static506.aClass129_5, Static506.aClass129_5);
		super.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
		super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
		super.aClass42_Sub1_19.method5996(1);
		super.aClass42_Sub1_19.method5868(null);
		super.aClass42_Sub1_19.method5915(0);
		super.aClass42_Sub1_19.method5967(0, Static159.aClass302_1);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		super.aClass42_Sub1_19.method5915(1);
		super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static88.aClass129_1);
		super.aClass42_Sub1_19.method5983(true, false, 0, Static159.aClass302_1);
		super.aClass42_Sub1_19.method5967(0, Static499.aClass302_4);
		super.aClass42_Sub1_19.method5996(0);
		super.aClass42_Sub1_19.method5915(0);
		super.aClass42_Sub1_19.method5935(-16777216);
		super.aClass42_Sub1_19.method5967(0, Static371.aClass302_2);
		this.method7554();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub1_19.method5945(Static191.aClass129_3, Static506.aClass129_5);
	}
}
