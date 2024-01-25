import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class2_Sub3_Sub13 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qba", name = "t", descriptor = "I")
	public int anInt7256;

	@OriginalMember(owner = "client!qba", name = "v", descriptor = "I")
	public int anInt7258;

	@OriginalMember(owner = "client!qba", name = "x", descriptor = "Ljava/lang/String;")
	public String aString64;

	@OriginalMember(owner = "client!qba", name = "A", descriptor = "I")
	public int anInt7261;

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(II)V")
	public Class2_Sub3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong268 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)I")
	public int method6094() {
		return (int) (super.aLong268 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!qba", name = "i", descriptor = "(I)V")
	public void method6095() {
		super.aLong260 = super.aLong260 & Long.MIN_VALUE | Static548.method7437() + 500L;
		Static266.aClass171_3.method3791(this);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(B)J")
	public long method6097() {
		return Long.MAX_VALUE & super.aLong260;
	}

	@OriginalMember(owner = "client!qba", name = "c", descriptor = "(B)V")
	public void method6098() {
		super.aLong260 |= Long.MIN_VALUE;
		if (this.method6097() == 0L) {
			Static128.aClass171_2.method3791(this);
		}
	}

	@OriginalMember(owner = "client!qba", name = "j", descriptor = "(I)I")
	public int method6099() {
		return (int) super.aLong268;
	}
}
