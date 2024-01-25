import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class2_Sub13_Sub5 extends Class2_Sub13 {

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
	private int anInt9793;

	@OriginalMember(owner = "client!vp", name = "K", descriptor = "Z")
	private boolean aBoolean720;

	@OriginalMember(owner = "client!vp", name = "N", descriptor = "Z")
	private boolean aBoolean721;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "Lclient!fha;")
	private final Class109 aClass109_72 = new Class109();

	@OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
	private int anInt9794 = 256;

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
	private int anInt9795 = 256;

	@OriginalMember(owner = "client!vp", name = "M", descriptor = "I")
	private int anInt9796 = 0;

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
	private final int anInt9788;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(I)V")
	public Class2_Sub13_Sub5(@OriginalArg(0) int arg0) {
		this.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IZ)V")
	public synchronized void method8181(@OriginalArg(1) boolean arg0) {
		this.aBoolean721 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8174() {
		return null;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	private synchronized void method8182() {
		@Pc(15) Class2_Sub2_Sub17 local15 = this.method8186();
		if (local15 != null) {
			local15.method8653();
			this.anInt9796--;
			this.anInt9793 = 0;
			Static513.aClass47_3.method915(local15.method5164(), local15);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)I")
	public synchronized int method8183() {
		return this.anInt9796;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8176(@OriginalArg(0) int arg0) {
		if (this.aBoolean721) {
			return;
		}
		while (true) {
			@Pc(11) Class2_Sub2_Sub17 local11 = this.method8186();
			if (local11 == null) {
				if (this.aBoolean720) {
					this.method8653();
					Static513.aClass47_3.method913();
				}
				return;
			}
			if (local11.aShortArrayArray24[0].length - this.anInt9793 > arg0) {
				this.anInt9793 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray24[0].length - this.anInt9793;
			this.method8182();
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(DII)Lclient!nq;")
	public Class2_Sub2_Sub17 method8184(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1) {
		@Pc(11) long local11 = (long) (arg1 | this.anInt9788 << 0);
		@Pc(22) Class2_Sub2_Sub17 local22 = (Class2_Sub2_Sub17) Static513.aClass47_3.method912(local11);
		if (local22 == null) {
			local22 = new Class2_Sub2_Sub17(new short[this.anInt9788][arg1], arg0);
		} else {
			local22.aDouble35 = arg0;
			Static513.aClass47_3.method914(local11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V")
	public void method8185(@OriginalArg(1) int arg0) {
		this.anInt9794 = arg0;
		this.anInt9795 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Lclient!nq;")
	private synchronized Class2_Sub2_Sub17 method8186() {
		return (Class2_Sub2_Sub17) this.aClass109_72.method2325();
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "()I")
	@Override
	public int method8175() {
		return 1;
	}

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)D")
	public synchronized double method8188() {
		if (this.anInt9796 < 1) {
			return -1.0D;
		} else {
			@Pc(22) Class2_Sub2_Sub17 local22 = (Class2_Sub2_Sub17) this.aClass109_72.method2325();
			return local22 == null ? -1.0D : local22.aDouble35 - (double) ((float) local22.aShortArrayArray24[0].length / (float) Static283.anInt7446);
		}
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "()Lclient!ua;")
	@Override
	public Class2_Sub13 method8178() {
		return null;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!nq;B)V")
	public synchronized void method8189(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		while (this.anInt9796 >= 100) {
			this.aClass109_72.method2322();
			this.anInt9796--;
		}
		this.aClass109_72.method2323(arg0);
		this.anInt9796++;
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
	public synchronized void method8190() {
		this.aBoolean720 = true;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8180(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean721) {
			return;
		}
		if (this.method8186() != null) {
			@Pc(28) int local28 = arg1 + arg2;
			if (Static452.aBoolean540) {
				local28 <<= 0x1;
			}
			@Pc(38) byte local38 = 0;
			if (this.anInt9788 == 2) {
				local38 = 1;
			}
			while (arg1 < local28) {
				@Pc(52) Class2_Sub2_Sub17 local52 = this.method8186();
				if (local52 == null) {
					return;
				}
				@Pc(58) short[][] local58 = local52.aShortArrayArray24;
				while (arg1 < local28 && local58[0].length > this.anInt9793) {
					if (Static452.aBoolean540) {
						arg0[arg1++] = local58[0][this.anInt9793] * this.anInt9795;
						arg0[arg1++] = this.anInt9794 * local58[local38][this.anInt9793];
					} else {
						@Pc(92) int local92 = arg1++;
						arg0[local92] += this.anInt9795 * local58[0][this.anInt9793] + this.anInt9794 * local58[local38][this.anInt9793];
					}
					this.anInt9793++;
				}
				if (local58[0].length <= this.anInt9793) {
					this.method8182();
				}
			}
		} else if (this.aBoolean720) {
			this.method8653();
			Static513.aClass47_3.method913();
		}
	}
}
