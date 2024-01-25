import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class6_Sub5_Sub8 extends Class6_Sub5 {

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "Ljava/lang/String;")
	public String aString35;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
	public int anInt3734;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public int anInt3739;

	@OriginalMember(owner = "client!hd", name = "D", descriptor = "I")
	public int anInt3740;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(II)V")
	public Class6_Sub5_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong245 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)I")
	public int method3255() {
		return (int) (super.aLong245 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
	public void method3256() {
		super.aLong242 |= Long.MIN_VALUE;
		if (this.method3258() == 0L) {
			Static444.aClass256_9.method5906(this);
		}
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	public void method3257() {
		super.aLong242 = super.aLong242 & Long.MIN_VALUE | Static416.method5922() + 500L;
		Static418.aClass256_8.method5906(this);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)J")
	public long method3258() {
		return Long.MAX_VALUE & super.aLong242;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)I")
	public int method3259() {
		return (int) super.aLong245;
	}
}
