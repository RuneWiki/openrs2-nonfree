import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!we", name = "Y", descriptor = "I")
	private int anInt4411;

	@OriginalMember(owner = "client!we", name = "Z", descriptor = "I")
	private int anInt4412;

	@OriginalMember(owner = "client!we", name = "fb", descriptor = "I")
	private int anInt4414;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		this(0);
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub39(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method3478(arg0);
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.method3478(arg1.method2135());
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(25) int[][] local25 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(33) int[] local33 = local25[0];
			@Pc(37) int[] local37 = local25[1];
			@Pc(41) int[] local41 = local25[2];
			for (@Pc(43) int local43 = 0; local43 < Static76.anInt1531; local43++) {
				local33[local43] = this.anInt4414;
				local37[local43] = this.anInt4412;
				local41[local43] = this.anInt4411;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)V")
	private void method3478(@OriginalArg(0) int arg0) {
		this.anInt4411 = (arg0 & 0xFF) << 4;
		this.anInt4412 = arg0 >> 4 & 0xFF0;
		this.anInt4414 = arg0 >> 12 & 0xFF0;
	}
}
