import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public final class Class1_Sub7_Sub1 extends Class1_Sub7 {

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public int anInt1534;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
	public int anInt1533;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public int anInt1535;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I[BII)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1534 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1533 = arg2;
		this.anInt1535 = arg3;
	}

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I[BIIZ)V")
	public Class1_Sub7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		this.anInt1534 = arg0;
		this.aByteArray21 = arg1;
		this.anInt1533 = arg2;
		this.anInt1535 = arg3;
		this.aBoolean88 = arg4;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ga;)Lclient!ec;")
	public Class1_Sub7_Sub1 method1067(@OriginalArg(0) Class46 arg0) {
		this.aByteArray21 = arg0.method1475(this.aByteArray21);
		this.anInt1534 = arg0.method1476(this.anInt1534);
		if (this.anInt1533 == this.anInt1535) {
			this.anInt1533 = this.anInt1535 = arg0.method1473(this.anInt1533);
		} else {
			this.anInt1533 = arg0.method1473(this.anInt1533);
			this.anInt1535 = arg0.method1473(this.anInt1535);
			if (this.anInt1533 == this.anInt1535) {
				this.anInt1533--;
			}
		}
		return this;
	}
}
