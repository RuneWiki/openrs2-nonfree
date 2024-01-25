import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class14_Sub1_Sub21 extends Class14_Sub1 {

	@OriginalMember(owner = "client!kia", name = "E", descriptor = "I")
	private int anInt5319;

	@OriginalMember(owner = "client!kia", name = "J", descriptor = "I")
	private int anInt5322;

	@OriginalMember(owner = "client!kia", name = "M", descriptor = "I")
	private int anInt5325;

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub21() {
		this(0);
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(I)V")
	private Class14_Sub1_Sub21(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4464(arg0);
	}

	@OriginalMember(owner = "client!kia", name = "c", descriptor = "(II)V")
	private void method4464(@OriginalArg(0) int arg0) {
		this.anInt5325 = (arg0 & 0xFF) << 4;
		this.anInt5322 = arg0 >> 4 & 0xFF0;
		this.anInt5319 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static371.anInt6835; local35++) {
				local25[local35] = this.anInt5319;
				local29[local35] = this.anInt5322;
				local33[local35] = this.anInt5325;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method4464(arg0.method5862());
		}
	}
}
