import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class1_Sub40_Sub1 extends Class1_Sub40 {

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "Z")
	public boolean aBoolean560;

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
	public int anInt7667;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
	public int anInt7666;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
	public int anInt7668;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7667 = arg0;
		this.aByteArray79 = arg1;
		this.anInt7666 = arg2;
		this.anInt7668 = arg3;
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt7667 = arg0;
		this.aByteArray79 = arg1;
		this.anInt7666 = arg2;
		this.anInt7668 = arg3;
		this.aBoolean560 = arg4;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!np;)Lclient!ql;")
	public Class1_Sub40_Sub1 method6314(@OriginalArg(0) Class229 arg0) {
		this.aByteArray79 = arg0.method5265(this.aByteArray79);
		this.anInt7667 = arg0.method5264(this.anInt7667);
		if (this.anInt7666 == this.anInt7668) {
			this.anInt7666 = this.anInt7668 = arg0.method5262(this.anInt7666);
		} else {
			this.anInt7666 = arg0.method5262(this.anInt7666);
			this.anInt7668 = arg0.method5262(this.anInt7668);
			if (this.anInt7666 == this.anInt7668) {
				this.anInt7666--;
			}
		}
		return this;
	}
}
