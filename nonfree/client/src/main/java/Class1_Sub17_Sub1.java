import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class1_Sub17_Sub1 extends Class1_Sub17 {

	@OriginalMember(owner = "client!m", name = "v", descriptor = "Z")
	public boolean aBoolean104;

	@OriginalMember(owner = "client!m", name = "y", descriptor = "I")
	public int anInt1967;

	@OriginalMember(owner = "client!m", name = "w", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!m", name = "z", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!m", name = "x", descriptor = "I")
	public int anInt1966;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1967 = arg0;
		this.aByteArray32 = arg1;
		this.anInt1968 = arg2;
		this.anInt1966 = arg3;
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1967 = arg0;
		this.aByteArray32 = arg1;
		this.anInt1968 = arg2;
		this.anInt1966 = arg3;
		this.aBoolean104 = arg4;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!ke;)Lclient!m;")
	public Class1_Sub17_Sub1 method1299(@OriginalArg(0) Class43 arg0) {
		this.aByteArray32 = arg0.method1124(this.aByteArray32);
		this.anInt1967 = arg0.method1123(this.anInt1967);
		if (this.anInt1968 == this.anInt1966) {
			this.anInt1968 = this.anInt1966 = arg0.method1122(this.anInt1968);
		} else {
			this.anInt1968 = arg0.method1122(this.anInt1968);
			this.anInt1966 = arg0.method1122(this.anInt1966);
			if (this.anInt1968 == this.anInt1966) {
				this.anInt1968--;
			}
		}
		return this;
	}
}
