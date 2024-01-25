import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class5_Sub24_Sub1 extends Class5_Sub24 {

	@OriginalMember(owner = "client!ps", name = "m", descriptor = "Z")
	public boolean aBoolean594;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
	public int anInt7869;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
	public int anInt7870;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	public int anInt7871;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7869 = arg0;
		this.aByteArray77 = arg1;
		this.anInt7870 = arg2;
		this.anInt7871 = arg3;
	}

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7869 = arg0;
		this.aByteArray77 = arg1;
		this.anInt7870 = arg2;
		this.anInt7871 = arg3;
		this.aBoolean594 = arg4;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!wu;)Lclient!ps;")
	public Class5_Sub24_Sub1 method6765(@OriginalArg(0) Class393 arg0) {
		this.aByteArray77 = arg0.method9298(this.aByteArray77);
		this.anInt7869 = arg0.method9303(this.anInt7869);
		if (this.anInt7870 == this.anInt7871) {
			this.anInt7870 = this.anInt7871 = arg0.method9300(this.anInt7870);
		} else {
			this.anInt7870 = arg0.method9300(this.anInt7870);
			this.anInt7871 = arg0.method9300(this.anInt7871);
			if (this.anInt7870 == this.anInt7871) {
				this.anInt7870--;
			}
		}
		return this;
	}
}
