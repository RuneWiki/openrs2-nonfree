import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class3_Sub3_Sub1 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FB)V")
	public void method833(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray54[super.anInt4736++] = (byte) local6;
		super.aByteArray54[super.anInt4736++] = (byte) (local6 >> 8);
		super.aByteArray54[super.anInt4736++] = (byte) (local6 >> 16);
		super.aByteArray54[super.anInt4736++] = (byte) (local6 >> 24);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(FB)V")
	public void method834(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = Stream.floatToRawIntBits(arg0);
		super.aByteArray54[super.anInt4736++] = (byte) (local6 >> 24);
		super.aByteArray54[super.anInt4736++] = (byte) (local6 >> 16);
		super.aByteArray54[super.anInt4736++] = (byte) (local6 >> 8);
		super.aByteArray54[super.anInt4736++] = (byte) local6;
	}
}
