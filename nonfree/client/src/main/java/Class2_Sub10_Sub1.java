import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
	public boolean aBoolean43;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "[B")
	public byte[] aByteArray23;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public int anInt850;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt849 = arg0;
		this.aByteArray23 = arg1;
		this.anInt848 = arg2;
		this.anInt850 = arg3;
	}

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt849 = arg0;
		this.aByteArray23 = arg1;
		this.anInt848 = arg2;
		this.anInt850 = arg3;
		this.aBoolean43 = arg4;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!ec;)Lclient!ck;")
	public Class2_Sub10_Sub1 method728(@OriginalArg(0) Class63 arg0) {
		this.aByteArray23 = arg0.method1479(this.aByteArray23);
		this.anInt849 = arg0.method1476(this.anInt849);
		if (this.anInt848 == this.anInt850) {
			this.anInt848 = this.anInt850 = arg0.method1473(this.anInt848);
		} else {
			this.anInt848 = arg0.method1473(this.anInt848);
			this.anInt850 = arg0.method1473(this.anInt850);
			if (this.anInt848 == this.anInt850) {
				this.anInt848--;
			}
		}
		return this;
	}
}
