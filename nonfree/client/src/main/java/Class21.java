import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class21 implements Interface2 {

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!ja;")
	private Class37 aClass37_7 = new Class37();

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	private int anInt838 = 0;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	private int anInt839 = 128;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	private final int anInt836;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Lclient!tb;")
	private final Class44 aClass44_17;

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!q;")
	private final Class3_Sub14[] aClass3_Sub14Array1;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!tb;Lclient!tb;IDI)V")
	public Class21(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.aDouble9 = arg3;
		this.anInt836 = arg2;
		this.anInt838 = this.anInt836;
		this.anInt839 = arg4;
		this.aClass44_17 = arg1;
		@Pc(38) int[] local38 = arg0.method1149(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub14Array1 = new Class3_Sub14[arg0.method1151(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub2 local63 = new Class3_Sub2(arg0.method1146(0, local38[local50]));
			this.aClass3_Sub14Array1[local38[local50]] = new Class3_Sub14(local63);
		}
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)V")
	public void method572(@OriginalArg(0) int arg0) {
		for (@Pc(12) int local12 = 0; local12 < this.aClass3_Sub14Array1.length; local12++) {
			@Pc(19) Class3_Sub14 local19 = this.aClass3_Sub14Array1[local12];
			if (local19 != null && local19.anInt2387 != 0 && local19.aBoolean112) {
				local19.method1623(arg0);
				local19.aBoolean112 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ID)V")
	public void method573(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method574();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public void method574() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub14Array1.length; local3++) {
			if (this.aClass3_Sub14Array1[local3] != null) {
				this.aClass3_Sub14Array1[local3].method1622();
			}
		}
		this.aClass37_7 = new Class37();
		this.anInt838 = this.anInt836;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method568(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub14Array1[arg0].aBoolean111;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)I")
	@Override
	public int method570(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub14Array1[arg0] == null ? 0 : this.aClass3_Sub14Array1[arg0].anInt2388;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method569(@OriginalArg(0) int arg0) {
		return this.anInt839 == 64;
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method571(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub14 local4 = this.aClass3_Sub14Array1[arg0];
		if (local4 != null) {
			if (local4.anIntArray212 != null) {
				this.aClass37_7.method991(local4);
				local4.aBoolean112 = true;
				return local4.anIntArray212;
			}
			@Pc(43) boolean local43 = local4.method1621(this.aDouble9, this.anInt839, this.aClass44_17);
			if (local43) {
				if (this.anInt838 == 0) {
					@Pc(54) Class3_Sub14 local54 = (Class3_Sub14) this.aClass37_7.method992();
					local54.method1622();
				} else {
					this.anInt838--;
				}
				this.aClass37_7.method991(local4);
				local4.aBoolean112 = true;
				return local4.anIntArray212;
			}
		}
		return null;
	}
}
