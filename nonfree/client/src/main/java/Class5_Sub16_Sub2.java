import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class5_Sub16_Sub2 extends Class5_Sub16 {

	@OriginalMember(owner = "client!hf", name = "B", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
	private int anInt3546;

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "Z")
	private boolean aBoolean282;

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "Lclient!ef;")
	private final Class102 aClass102_29 = new Class102();

	@OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
	private int anInt3545 = 256;

	@OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
	private int anInt3543 = 0;

	@OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
	private int anInt3547 = 256;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
	private final int anInt3539;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I)V")
	public Class5_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.anInt3539 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
	private synchronized void method3101() {
		@Pc(7) Class5_Sub5_Sub14 local7 = this.method3113();
		if (local7 != null) {
			local7.method9327(1);
			this.anInt3543--;
			this.anInt3546 = 0;
			Static60.aClass90_2.method1631(local7, local7.method4141());
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!jja;I)V")
	public synchronized void method3102(@OriginalArg(0) Class5_Sub5_Sub14 arg0) {
		while (this.anInt3543 >= 100) {
			this.aClass102_29.method1928();
			this.anInt3543--;
		}
		this.aClass102_29.method1921(arg0);
		this.anInt3543++;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8735() {
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
	public void method3104(@OriginalArg(1) int arg0) {
		this.anInt3547 = arg0;
		this.anInt3545 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "()Lclient!fq;")
	@Override
	public Class5_Sub16 method8737() {
		return null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
	public synchronized void method3105(@OriginalArg(1) boolean arg0) {
		this.aBoolean281 = arg0;
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)I")
	public synchronized int method3107() {
		return this.anInt3543;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(DBI)Lclient!jja;")
	public Class5_Sub5_Sub14 method3108(@OriginalArg(0) double arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg1 | this.anInt3539 << 0);
		@Pc(25) Class5_Sub5_Sub14 local25 = (Class5_Sub5_Sub14) Static60.aClass90_2.method1632(local11);
		if (local25 == null) {
			local25 = new Class5_Sub5_Sub14(new short[this.anInt3539][arg1], arg0);
		} else {
			local25.aDouble11 = arg0;
			Static60.aClass90_2.method1630(local11);
		}
		return local25;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8738(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean281) {
			return;
		}
		if (this.method3113() != null) {
			@Pc(33) int local33 = arg1 + arg2;
			if (Static128.aBoolean541) {
				local33 <<= 0x1;
			}
			@Pc(43) byte local43 = 0;
			if (this.anInt3539 == 2) {
				local43 = 1;
			}
			while (local33 > arg1) {
				@Pc(59) Class5_Sub5_Sub14 local59 = this.method3113();
				if (local59 == null) {
					return;
				}
				@Pc(65) short[][] local65 = local59.aShortArrayArray6;
				while (arg1 < local33 && this.anInt3546 < local65[0].length) {
					if (Static128.aBoolean541) {
						arg0[arg1++] = local65[0][this.anInt3546] * this.anInt3545;
						arg0[arg1++] = this.anInt3547 * local65[local43][this.anInt3546];
					} else {
						@Pc(73) int local73 = arg1++;
						arg0[local73] += local65[local43][this.anInt3546] * this.anInt3547 + local65[0][this.anInt3546] * this.anInt3545;
					}
					this.anInt3546++;
				}
				if (local65[0].length <= this.anInt3546) {
					this.method3101();
				}
			}
		} else if (this.aBoolean282) {
			this.method9327(1);
			Static60.aClass90_2.method1633();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public synchronized void method3109() {
		this.aBoolean282 = true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8740(@OriginalArg(0) int arg0) {
		if (this.aBoolean281) {
			return;
		}
		while (true) {
			@Pc(14) Class5_Sub5_Sub14 local14 = this.method3113();
			if (local14 == null) {
				if (this.aBoolean282) {
					this.method9327(1);
					Static60.aClass90_2.method1633();
				}
				return;
			}
			if (arg0 < local14.aShortArrayArray6[0].length - this.anInt3546) {
				this.anInt3546 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray6[0].length - this.anInt3546;
			this.method3101();
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)D")
	public synchronized double method3111() {
		if (this.anInt3543 < 1) {
			return -1.0D;
		} else {
			@Pc(24) Class5_Sub5_Sub14 local24 = (Class5_Sub5_Sub14) this.aClass102_29.method1916();
			return local24 == null ? -1.0D : (double) -((float) local24.aShortArrayArray6[0].length / (float) Static608.anInt10099) + local24.aDouble11;
		}
	}

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)Lclient!jja;")
	private synchronized Class5_Sub5_Sub14 method3113() {
		return (Class5_Sub5_Sub14) this.aClass102_29.method1916();
	}

	@OriginalMember(owner = "client!hf", name = "c", descriptor = "()I")
	@Override
	public int method8739() {
		return 1;
	}
}
