import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class4_Sub11_Sub2 extends Class4_Sub11 {

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(I)V")
	public Class4_Sub11_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(FI)V")
	public void method8895(@OriginalArg(0) float arg0) {
		@Pc(10) int local10 = Stream.floatToRawIntBits(arg0);
		super.aByteArray107[super.anInt10466++] = (byte) local10;
		super.aByteArray107[super.anInt10466++] = (byte) (local10 >> 8);
		super.aByteArray107[super.anInt10466++] = (byte) (local10 >> 16);
		super.aByteArray107[super.anInt10466++] = (byte) (local10 >> 24);
	}

	@OriginalMember(owner = "client!wja", name = "b", descriptor = "(FI)V")
	public void method8897(@OriginalArg(0) float arg0) {
		@Pc(11) int local11 = Stream.floatToRawIntBits(arg0);
		super.aByteArray107[super.anInt10466++] = (byte) (local11 >> 24);
		super.aByteArray107[super.anInt10466++] = (byte) (local11 >> 16);
		super.aByteArray107[super.anInt10466++] = (byte) (local11 >> 8);
		super.aByteArray107[super.anInt10466++] = (byte) local11;
	}
}
