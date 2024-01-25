import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public final class Class2_Sub29_Sub1 extends Class2_Sub29 {

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "Z")
	public boolean aBoolean543;

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public int anInt7490;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
	public int anInt7489;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public int anInt7488;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I[BII)V")
	public Class2_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7490 = arg0;
		this.aByteArray97 = arg1;
		this.anInt7489 = arg2;
		this.anInt7488 = arg3;
	}

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class2_Sub29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7490 = arg0;
		this.aByteArray97 = arg1;
		this.anInt7489 = arg2;
		this.anInt7488 = arg3;
		this.aBoolean543 = arg4;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!pe;)Lclient!ob;")
	public Class2_Sub29_Sub1 method6418(@OriginalArg(0) Class257 arg0) {
		this.aByteArray97 = arg0.method6791(this.aByteArray97);
		this.anInt7490 = arg0.method6789(this.anInt7490);
		if (this.anInt7489 == this.anInt7488) {
			this.anInt7489 = this.anInt7488 = arg0.method6794(this.anInt7489);
		} else {
			this.anInt7489 = arg0.method6794(this.anInt7489);
			this.anInt7488 = arg0.method6794(this.anInt7488);
			if (this.anInt7489 == this.anInt7488) {
				this.anInt7489--;
			}
		}
		return this;
	}
}
