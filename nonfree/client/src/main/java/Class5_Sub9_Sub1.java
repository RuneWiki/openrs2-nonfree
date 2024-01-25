import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public final class Class5_Sub9_Sub1 extends Class5_Sub9 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[BII)V")
	public Class5_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt490 = arg0;
		this.aByteArray4 = arg1;
		this.anInt489 = arg2;
		this.anInt488 = arg3;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class5_Sub9_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt490 = arg0;
		this.aByteArray4 = arg1;
		this.anInt489 = arg2;
		this.anInt488 = arg3;
		this.aBoolean20 = arg4;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!hr;)Lclient!bc;")
	public Class5_Sub9_Sub1 method462(@OriginalArg(0) Class158 arg0) {
		this.aByteArray4 = arg0.method3329(this.aByteArray4);
		this.anInt490 = arg0.method3328(this.anInt490);
		if (this.anInt489 == this.anInt488) {
			this.anInt489 = this.anInt488 = arg0.method3332(this.anInt489);
		} else {
			this.anInt489 = arg0.method3332(this.anInt489);
			this.anInt488 = arg0.method3332(this.anInt488);
			if (this.anInt489 == this.anInt488) {
				this.anInt489--;
			}
		}
		return this;
	}
}
