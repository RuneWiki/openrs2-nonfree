import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public final class Class3_Sub13_Sub1 extends Class3_Sub13 {

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public int anInt1849;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[B")
	public byte[] aByteArray24;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
	public int anInt1850;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	public int anInt1851;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[BII)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1849 = arg0;
		this.aByteArray24 = arg1;
		this.anInt1850 = arg2;
		this.anInt1851 = arg3;
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class3_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1849 = arg0;
		this.aByteArray24 = arg1;
		this.anInt1850 = arg2;
		this.anInt1851 = arg3;
		this.aBoolean152 = arg4;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!rf;)Lclient!eb;")
	public Class3_Sub13_Sub1 method1496(@OriginalArg(0) Class199 arg0) {
		this.aByteArray24 = arg0.method4906(this.aByteArray24);
		this.anInt1849 = arg0.method4903(this.anInt1849);
		if (this.anInt1850 == this.anInt1851) {
			this.anInt1850 = this.anInt1851 = arg0.method4905(this.anInt1850);
		} else {
			this.anInt1850 = arg0.method4905(this.anInt1850);
			this.anInt1851 = arg0.method4905(this.anInt1851);
			if (this.anInt1850 == this.anInt1851) {
				this.anInt1850--;
			}
		}
		return this;
	}
}
