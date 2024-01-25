import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "Ljava/lang/String;")
	public String aString33;

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public int anInt3820;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
	public int anInt3823;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong228 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public int method2952() {
		return (int) super.aLong228;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	public void method2954() {
		super.aLong227 = Static250.method3737() + 500L | Long.MIN_VALUE & super.aLong227;
		Static223.aClass262_3.method5876(this);
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I")
	public int method2955() {
		return (int) (super.aLong228 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)J")
	public long method2956() {
		return super.aLong227 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
	public void method2957() {
		super.aLong227 |= Long.MIN_VALUE;
		if (this.method2956() == 0L) {
			Static445.aClass262_12.method5876(this);
		}
	}
}
