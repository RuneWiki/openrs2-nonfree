import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class4_Sub5_Sub16 extends Class4_Sub5 {

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public int anInt8736;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public int anInt8738;

	@OriginalMember(owner = "client!se", name = "y", descriptor = "I")
	public int anInt8739;

	@OriginalMember(owner = "client!se", name = "z", descriptor = "Ljava/lang/String;")
	public String aString84;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(II)V")
	public Class4_Sub5_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong268 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)J")
	public long method7131() {
		return Long.MAX_VALUE & super.aLong257;
	}

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
	public int method7132() {
		return (int) (super.aLong268 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(I)V")
	public void method7133() {
		super.aLong257 |= Long.MIN_VALUE;
		if (this.method7131() == 0L) {
			Static469.aClass18_6.method219(this);
		}
	}

	@OriginalMember(owner = "client!se", name = "i", descriptor = "(I)V")
	public void method7134() {
		super.aLong257 = super.aLong257 & Long.MIN_VALUE | Static574.method8210() + 500L;
		Static482.aClass18_7.method219(this);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I")
	public int method7135() {
		return (int) super.aLong268;
	}
}
