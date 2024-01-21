import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public final class Class2_Sub12_Sub1 extends Class2_Sub12 {

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
	public int anInt2819;

	@OriginalMember(owner = "client!wd", name = "db", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
	public int anInt2817;

	@OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
	public int anInt2818;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2819 = arg0;
		this.aByteArray24 = arg1;
		this.anInt2817 = arg2;
		this.anInt2818 = arg3;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!qb;)Lclient!wd;")
	public Class2_Sub12_Sub1 method1823(@OriginalArg(0) Class49 arg0) {
		this.aByteArray24 = arg0.method1493(this.aByteArray24);
		this.anInt2819 = arg0.method1490(this.anInt2819);
		if (this.anInt2817 == this.anInt2818) {
			this.anInt2817 = this.anInt2818 = arg0.method1488(this.anInt2817);
		} else {
			this.anInt2817 = arg0.method1488(this.anInt2817);
			this.anInt2818 = arg0.method1488(this.anInt2818);
			if (this.anInt2817 == this.anInt2818) {
				this.anInt2817--;
			}
		}
		return this;
	}
}
