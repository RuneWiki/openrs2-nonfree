import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class5_Sub12_Sub1 extends Class5_Sub12 {

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V")
	public Class5_Sub12_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BF)V")
	public void method1300(@OriginalArg(1) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray90[this.anInt5731++] = (byte) (local2 >> 24);
		this.aByteArray90[this.anInt5731++] = (byte) (local2 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (local2 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) local2;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(FI)V")
	public void method1301(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Float.floatToRawIntBits(arg0);
		this.aByteArray90[this.anInt5731++] = (byte) local2;
		this.aByteArray90[this.anInt5731++] = (byte) (local2 >> 8);
		this.aByteArray90[this.anInt5731++] = (byte) (local2 >> 16);
		this.aByteArray90[this.anInt5731++] = (byte) (local2 >> 24);
	}
}
