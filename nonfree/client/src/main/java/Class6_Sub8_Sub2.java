import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class6_Sub8_Sub2 extends Class6_Sub8 {

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BF)V")
	public void method8270(@OriginalArg(1) float arg0) {
		@Pc(14) int local14 = Stream.floatToRawIntBits(arg0);
		super.aByteArray102[super.anInt10061++] = (byte) (local14 >> 24);
		super.aByteArray102[super.anInt10061++] = (byte) (local14 >> 16);
		super.aByteArray102[super.anInt10061++] = (byte) (local14 >> 8);
		super.aByteArray102[super.anInt10061++] = (byte) local14;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(BF)V")
	public void method8271(@OriginalArg(1) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray102[super.anInt10061++] = (byte) local6;
		super.aByteArray102[super.anInt10061++] = (byte) (local6 >> 8);
		super.aByteArray102[super.anInt10061++] = (byte) (local6 >> 16);
		super.aByteArray102[super.anInt10061++] = (byte) (local6 >> 24);
	}
}
