import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!pb", name = "kb", descriptor = "I")
	private int anInt3405 = 0;

	@OriginalMember(owner = "client!pb", name = "vb", descriptor = "I")
	private int anInt3411 = -32768;

	@OriginalMember(owner = "client!pb", name = "ob", descriptor = "Z")
	public boolean aBoolean139 = false;

	@OriginalMember(owner = "client!pb", name = "Bb", descriptor = "I")
	private int anInt3414 = 0;

	@OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
	public final int anInt3407;

	@OriginalMember(owner = "client!pb", name = "Cb", descriptor = "I")
	public final int anInt3415;

	@OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
	private final int anInt3404;

	@OriginalMember(owner = "client!pb", name = "rb", descriptor = "I")
	public final int anInt3409;

	@OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
	public final int anInt3401;

	@OriginalMember(owner = "client!pb", name = "wb", descriptor = "I")
	public final int anInt3412;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "Lclient!kg;")
	private Class1_Sub2_Sub14 aClass1_Sub2_Sub14_3;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class6_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3407 = arg1;
		this.anInt3415 = arg4;
		this.anInt3404 = arg0;
		this.anInt3409 = arg2;
		this.anInt3401 = arg3;
		this.anInt3412 = arg6 + arg5;
		@Pc(40) int local40 = Static18.method345(this.anInt3404).anInt1270;
		if (local40 == -1) {
			this.aBoolean139 = true;
		} else {
			this.aBoolean139 = false;
			this.aClass1_Sub2_Sub14_3 = Static173.method2924(local40);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class6_Sub3 local7 = this.method2608();
		if (local7 != null) {
			local7.method2989(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3411 = local7.method2984();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
	@Override
	public int method2984() {
		return this.anInt3411;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!bf;")
	private Class6_Sub3 method2608() {
		@Pc(8) Class1_Sub2_Sub9 local8 = Static18.method345(this.anInt3404);
		@Pc(24) Class6_Sub3 local24;
		if (this.aBoolean139) {
			local24 = local8.method823(-1);
		} else {
			local24 = local8.method823(this.anInt3405);
		}
		return local24 == null ? null : local24;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
	public void method2610(@OriginalArg(0) int arg0) {
		if (this.aBoolean139) {
			return;
		}
		this.anInt3414 += arg0;
		while (this.aClass1_Sub2_Sub14_3.anIntArray282[this.anInt3405] < this.anInt3414) {
			this.anInt3414 -= this.aClass1_Sub2_Sub14_3.anIntArray282[this.anInt3405];
			this.anInt3405++;
			if (this.anInt3405 >= this.aClass1_Sub2_Sub14_3.anIntArray284.length) {
				this.aBoolean139 = true;
				return;
			}
		}
	}
}
