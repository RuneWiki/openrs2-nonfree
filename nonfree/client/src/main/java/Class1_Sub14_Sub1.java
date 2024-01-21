import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Z")
	public boolean aBoolean115;

	@OriginalMember(owner = "client!u", name = "H", descriptor = "I")
	public int anInt2723;

	@OriginalMember(owner = "client!u", name = "E", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!u", name = "C", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!u", name = "G", descriptor = "I")
	public int anInt2722;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2723 = arg0;
		this.aByteArray36 = arg1;
		this.anInt2721 = arg2;
		this.anInt2722 = arg3;
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2723 = arg0;
		this.aByteArray36 = arg1;
		this.anInt2721 = arg2;
		this.anInt2722 = arg3;
		this.aBoolean115 = arg4;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!cf;)Lclient!u;")
	public Class1_Sub14_Sub1 method1932(@OriginalArg(0) Class12 arg0) {
		this.aByteArray36 = arg0.method415(this.aByteArray36);
		this.anInt2723 = arg0.method411(this.anInt2723);
		if (this.anInt2721 == this.anInt2722) {
			this.anInt2721 = this.anInt2722 = arg0.method410(this.anInt2721);
		} else {
			this.anInt2721 = arg0.method410(this.anInt2721);
			this.anInt2722 = arg0.method410(this.anInt2722);
			if (this.anInt2721 == this.anInt2722) {
				this.anInt2721--;
			}
		}
		return this;
	}
}
