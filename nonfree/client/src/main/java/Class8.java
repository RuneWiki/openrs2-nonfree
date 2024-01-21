import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class8 implements Interface3 {

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!bb;")
	private Class9 aClass9_1 = new Class9();

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	private int anInt78 = 0;

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	private int anInt79 = 128;

	@OriginalMember(owner = "client!ba", name = "v", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	private final int anInt77;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Lclient!he;")
	private final Class11 aClass11_4;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "[Lclient!t;")
	private final Class10_Sub12[] aClass10_Sub12Array1;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lclient!he;Lclient!he;IDI)V")
	public Class8(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble1 = arg3;
		this.anInt77 = arg2;
		this.anInt79 = arg4;
		this.aClass11_4 = arg1;
		this.anInt78 = this.anInt77;
		@Pc(38) int[] local38 = arg0.method223(0);
		@Pc(41) int local41 = local38.length;
		this.aClass10_Sub12Array1 = new Class10_Sub12[arg0.method217(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class10_Sub10 local63 = new Class10_Sub10(arg0.method203(0, local38[local50]));
			this.aClass10_Sub12Array1[local38[local50]] = new Class10_Sub12(local63);
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)V")
	public void method63(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass10_Sub12Array1.length; local3++) {
			@Pc(10) Class10_Sub12 local10 = this.aClass10_Sub12Array1[local3];
			if (local10 != null && local10.anInt2359 != 0 && local10.aBoolean106) {
				local10.method1451(arg0);
				local10.aBoolean106 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(DZ)V")
	public void method65(@OriginalArg(0) double arg0) {
		this.aDouble1 = arg0;
		this.method67();
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
	public void method67() {
		for (@Pc(5) int local5 = 0; local5 < this.aClass10_Sub12Array1.length; local5++) {
			if (this.aClass10_Sub12Array1[local5] != null) {
				this.aClass10_Sub12Array1[local5].method1450();
			}
		}
		this.aClass9_1 = new Class9();
		this.anInt78 = this.anInt77;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)I")
	@Override
	public int method59(@OriginalArg(0) int arg0) {
		return this.aClass10_Sub12Array1[arg0] == null ? 0 : this.aClass10_Sub12Array1[arg0].anInt2358;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method61(@OriginalArg(0) int arg0) {
		return this.aClass10_Sub12Array1[arg0].aBoolean105;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method62(@OriginalArg(0) int arg0) {
		return this.anInt79 == 64;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method60(@OriginalArg(1) int arg0) {
		@Pc(4) Class10_Sub12 local4 = this.aClass10_Sub12Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray315 != null) {
				this.aClass9_1.method78(local4);
				local4.aBoolean106 = true;
				return local4.anIntArray315;
			}
			@Pc(35) boolean local35 = local4.method1452(this.aDouble1, this.anInt79, this.aClass11_4);
			if (local35) {
				if (this.anInt78 == 0) {
					@Pc(54) Class10_Sub12 local54 = (Class10_Sub12) this.aClass9_1.method75();
					local54.method1450();
				} else {
					this.anInt78--;
				}
				this.aClass9_1.method78(local4);
				local4.aBoolean106 = true;
				return local4.anIntArray315;
			}
		}
		return null;
	}
}
