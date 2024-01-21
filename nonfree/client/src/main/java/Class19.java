import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class19 implements Interface2 {

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!c;")
	private Class11 aClass11_2 = new Class11();

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	private int anInt803 = 128;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "D")
	private double aDouble1 = 1.0D;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	private int anInt805 = 0;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private final int anInt804;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!we;")
	private final Class62 aClass62_6;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[Lclient!cf;")
	private final Class3_Sub4[] aClass3_Sub4Array1;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!we;Lclient!we;IDI)V")
	public Class19(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt804 = arg2;
		this.anInt803 = arg4;
		this.aClass62_6 = arg1;
		this.aDouble1 = arg3;
		this.anInt805 = this.anInt804;
		@Pc(38) int[] local38 = arg0.method1506(0);
		@Pc(41) int local41 = local38.length;
		this.aClass3_Sub4Array1 = new Class3_Sub4[arg0.method1507(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class3_Sub7 local63 = new Class3_Sub7(arg0.method1512(0, local38[local50]));
			this.aClass3_Sub4Array1[local38[local50]] = new Class3_Sub4(local63);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public void method494() {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub4Array1.length; local3++) {
			if (this.aClass3_Sub4Array1[local3] != null) {
				this.aClass3_Sub4Array1[local3].method251();
			}
		}
		this.aClass11_2 = new Class11();
		this.anInt805 = this.anInt804;
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)V")
	public void method496(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aClass3_Sub4Array1.length; local3++) {
			@Pc(10) Class3_Sub4 local10 = this.aClass3_Sub4Array1[local3];
			if (local10 != null && local10.anInt381 != 0 && local10.aBoolean20) {
				local10.method250(arg0);
				local10.aBoolean20 = false;
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
	@Override
	public int method491(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub4Array1[arg0] == null ? 0 : this.aClass3_Sub4Array1[arg0].anInt382;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method490(@OriginalArg(1) int arg0) {
		return this.anInt803 == 64;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method493(@OriginalArg(1) int arg0) {
		return this.aClass3_Sub4Array1[arg0].aBoolean21;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method492(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub4 local13 = this.aClass3_Sub4Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray43 != null) {
				this.aClass11_2.method197(local13);
				local13.aBoolean20 = true;
				return local13.anIntArray43;
			}
			@Pc(38) boolean local38 = local13.method249(this.aDouble1, this.anInt803, this.aClass62_6);
			if (local38) {
				if (this.anInt805 == 0) {
					@Pc(49) Class3_Sub4 local49 = (Class3_Sub4) this.aClass11_2.method186();
					local49.method251();
				} else {
					this.anInt805--;
				}
				this.aClass11_2.method197(local13);
				local13.aBoolean20 = true;
				return local13.anIntArray43;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ID)V")
	public void method497(@OriginalArg(1) double arg0) {
		this.aDouble1 = arg0;
		this.method494();
	}
}
