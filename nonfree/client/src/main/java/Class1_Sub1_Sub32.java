import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class1_Sub1_Sub32 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "I")
	private int anInt8008;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub32(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt8008 = 4096;
		this.anInt8008 = arg0;
	}

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub32() {
		this(4096);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			Static598.method772(local14, 0, Static501.anInt8748, this.anInt8008);
		}
		return local14;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8008 = (arg1.method7974() << 12) / 255;
		}
	}
}
