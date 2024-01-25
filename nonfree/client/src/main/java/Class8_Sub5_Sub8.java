import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class8_Sub5_Sub8 extends Class8_Sub5 {

	@OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
	public int anInt4321;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
	public int anInt4324;

	@OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
	public int anInt4329;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V")
	public Class8_Sub5_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong285 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)V")
	public void method3509() {
		super.aLong275 |= Long.MIN_VALUE;
		if (this.method3515() == 0L) {
			Static557.aClass302_13.method7328(this);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)V")
	public void method3512() {
		super.aLong275 = super.aLong275 & Long.MIN_VALUE | Static342.method5463() + 500L;
		Static465.aClass302_12.method7328(this);
	}

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(B)I")
	public int method3513() {
		return (int) super.aLong285;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I")
	public int method3514() {
		return (int) (super.aLong285 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)J")
	public long method3515() {
		return Long.MAX_VALUE & super.aLong275;
	}
}
