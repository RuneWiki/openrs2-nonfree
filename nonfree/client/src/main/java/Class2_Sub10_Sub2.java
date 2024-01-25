import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ct", name = "B", descriptor = "I")
	public int anInt1027;

	@OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
	public int anInt1028;

	@OriginalMember(owner = "client!ct", name = "M", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
	public int anInt1037;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(II)V")
	public Class2_Sub10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong209 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(Z)V")
	public void method859() {
		super.aLong206 = Static39.method699() + 500L | Long.MIN_VALUE & super.aLong206;
		Static189.aClass87_15.method2360(this);
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)I")
	public int method862() {
		return (int) (super.aLong209 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)V")
	public void method864() {
		super.aLong206 |= Long.MIN_VALUE;
		if (this.method866() == (long) 0) {
			Static238.aClass87_13.method2360(this);
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(Z)I")
	public int method865() {
		return (int) super.aLong209;
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)J")
	public long method866() {
		return super.aLong206 & Long.MAX_VALUE;
	}
}
