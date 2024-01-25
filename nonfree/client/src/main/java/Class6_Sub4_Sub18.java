import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class6_Sub4_Sub18 extends Class6_Sub4 {

	@OriginalMember(owner = "client!tia", name = "y", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!tia", name = "A", descriptor = "I")
	public int anInt9463;

	@OriginalMember(owner = "client!tia", name = "C", descriptor = "I")
	public int anInt9464;

	@OriginalMember(owner = "client!tia", name = "E", descriptor = "I")
	public int anInt9466;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(IJ)V")
	public Class6_Sub4_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong314 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(B)J")
	public long method7974() {
		return super.aLong310 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!tia", name = "d", descriptor = "(B)V")
	public void method7976() {
		super.aLong310 |= Long.MIN_VALUE;
		if (this.method7974() == 0L) {
			Static407.aClass384_13.method8909(this);
		}
	}

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "(B)I")
	public int method7977() {
		return (int) (super.aLong314 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "(B)J")
	public long method7978() {
		return super.aLong314 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!tia", name = "g", descriptor = "(I)V")
	public void method7979() {
		super.aLong310 = Static566.method7936() + 500L | Long.MIN_VALUE & super.aLong310;
		Static273.aClass384_8.method8909(this);
	}
}
