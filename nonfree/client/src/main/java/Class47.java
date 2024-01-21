import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class47 implements Interface1 {

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "Lclient!ie;")
	private Class31 aClass31_43 = new Class31();

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
	private int anInt1889 = 128;

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "D")
	private double aDouble9 = 1.0D;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	private int anInt1890 = 0;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	private final int anInt1891;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Lclient!q;")
	private final Class62 aClass62_23;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[Lclient!ae;")
	private final Class1_Sub4[] aClass1_Sub4Array1;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!q;Lclient!q;IDI)V")
	public Class47(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) double arg3, @OriginalArg(4) int arg4) {
		this.anInt1891 = arg2;
		this.anInt1890 = this.anInt1891;
		this.aDouble9 = arg3;
		this.aClass62_23 = arg1;
		this.anInt1889 = arg4;
		@Pc(38) int[] local38 = arg0.method2006(0);
		@Pc(41) int local41 = local38.length;
		this.aClass1_Sub4Array1 = new Class1_Sub4[arg0.method1999(0)];
		for (@Pc(50) int local50 = 0; local50 < local41; local50++) {
			@Pc(63) Class1_Sub18 local63 = new Class1_Sub18(arg0.method2008(local38[local50], 0));
			this.aClass1_Sub4Array1[local38[local50]] = new Class1_Sub4(local63);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public void method1289() {
		for (@Pc(15) int local15 = 0; local15 < this.aClass1_Sub4Array1.length; local15++) {
			if (this.aClass1_Sub4Array1[local15] != null) {
				this.aClass1_Sub4Array1[local15].method86();
			}
		}
		this.aClass31_43 = new Class31();
		this.anInt1890 = this.anInt1891;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method1286(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub4 local13 = this.aClass1_Sub4Array1[arg0];
		if (local13 != null) {
			if (local13.anIntArray31 != null) {
				this.aClass31_43.method996(local13);
				local13.aBoolean26 = true;
				return local13.anIntArray31;
			}
			@Pc(38) boolean local38 = local13.method88(this.aDouble9, this.anInt1889, this.aClass62_23);
			if (local38) {
				if (this.anInt1890 == 0) {
					@Pc(60) Class1_Sub4 local60 = (Class1_Sub4) this.aClass31_43.method1001();
					local60.method86();
				} else {
					this.anInt1890--;
				}
				this.aClass31_43.method996(local13);
				local13.aBoolean26 = true;
				return local13.anIntArray31;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I")
	@Override
	public int method1288(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub4Array1[arg0] == null ? 0 : this.aClass1_Sub4Array1[arg0].anInt176;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ID)V")
	public void method1292(@OriginalArg(1) double arg0) {
		this.aDouble9 = arg0;
		this.method1289();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)V")
	public void method1293(@OriginalArg(0) int arg0) {
		for (@Pc(8) int local8 = 0; local8 < this.aClass1_Sub4Array1.length; local8++) {
			@Pc(15) Class1_Sub4 local15 = this.aClass1_Sub4Array1[local8];
			if (local15 != null && local15.anInt177 != 0 && local15.aBoolean26) {
				local15.method89(arg0);
				local15.aBoolean26 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1285(@OriginalArg(0) int arg0) {
		return this.aClass1_Sub4Array1[arg0].aBoolean27;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method1287(@OriginalArg(1) int arg0) {
		return this.anInt1889 == 64;
	}
}
