import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class2_Sub6_Sub4 extends Class2_Sub6 {

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "Lclient!wi;")
	private Class108 aClass108_15 = new Class108();

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "Lclient!wi;")
	private Class108 aClass108_16 = new Class108();

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
	private int anInt4463 = -1;

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
	private int anInt4464 = 0;

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "([III)V")
	private void method3092(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class2_Sub6 local5 = (Class2_Sub6) this.aClass108_15.method3322(); local5 != null; local5 = (Class2_Sub6) this.aClass108_15.method3331()) {
			local5.method3087(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "()V")
	private void method3093() {
		if (this.anInt4464 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub11 local8 = (Class2_Sub11) this.aClass108_16.method3322(); local8 != null; local8 = (Class2_Sub11) this.aClass108_16.method3331()) {
			local8.anInt1713 -= this.anInt4464;
		}
		this.anInt4463 -= this.anInt4464;
		this.anInt4464 = 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method3085(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		do {
			if (this.anInt4463 < 0) {
				this.method3092(arg0, arg1, arg2);
				return;
			}
			if (this.anInt4464 + arg2 < this.anInt4463) {
				this.anInt4464 += arg2;
				this.method3092(arg0, arg1, arg2);
				return;
			}
			@Pc(33) int local33 = this.anInt4463 - this.anInt4464;
			this.method3092(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt4464 += local33;
			this.method3093();
			@Pc(60) Class2_Sub11 local60 = (Class2_Sub11) this.aClass108_16.method3322();
			synchronized (local60) {
				@Pc(68) int local68 = local60.method1191(this);
				if (local68 < 0) {
					local60.anInt1713 = 0;
					this.method3096(local60);
				} else {
					local60.anInt1713 = local68;
					this.method3098(local60.aClass2_212, local60);
				}
			}
		} while (arg2 != 0);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class2_Sub6 method3086() {
		return (Class2_Sub6) this.aClass108_15.method3331();
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method3090(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt4463 < 0) {
				this.method3095(arg0);
				return;
			}
			if (this.anInt4464 + arg0 < this.anInt4463) {
				this.anInt4464 += arg0;
				this.method3095(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt4463 - this.anInt4464;
			this.method3095(local29);
			arg0 -= local29;
			this.anInt4464 += local29;
			this.method3093();
			@Pc(50) Class2_Sub11 local50 = (Class2_Sub11) this.aClass108_16.method3322();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1191(this);
				if (local58 < 0) {
					local50.anInt1713 = 0;
					this.method3096(local50);
				} else {
					local50.anInt1713 = local58;
					this.method3098(local50.aClass2_212, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "()I")
	@Override
	public int method3089() {
		return 0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ef;)V")
	public synchronized void method3094(@OriginalArg(0) Class2_Sub6 arg0) {
		this.aClass108_15.method3327(arg0);
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	private void method3095(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class2_Sub6 local5 = (Class2_Sub6) this.aClass108_15.method3322(); local5 != null; local5 = (Class2_Sub6) this.aClass108_15.method3331()) {
			local5.method3090(arg0);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!gg;)V")
	private void method3096(@OriginalArg(0) Class2_Sub11 arg0) {
		arg0.method3314();
		arg0.method1190();
		@Pc(9) Class2 local9 = this.aClass108_16.aClass2_213.aClass2_212;
		if (local9 == this.aClass108_16.aClass2_213) {
			this.anInt4463 = -1;
		} else {
			this.anInt4463 = ((Class2_Sub11) local9).anInt1713;
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Lclient!ef;)V")
	public synchronized void method3097(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method3314();
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class2_Sub6 method3091() {
		return (Class2_Sub6) this.aClass108_15.method3322();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!g;Lclient!gg;)V")
	private void method3098(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub11 arg1) {
		while (arg0 != this.aClass108_16.aClass2_213 && ((Class2_Sub11) arg0).anInt1713 <= arg1.anInt1713) {
			arg0 = arg0.aClass2_212;
		}
		this.aClass108_16.method3332(arg1, arg0);
		this.anInt4463 = ((Class2_Sub11) this.aClass108_16.aClass2_213.aClass2_212).anInt1713;
	}
}
