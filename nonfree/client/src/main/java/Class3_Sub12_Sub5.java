import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class3_Sub12_Sub5 extends Class3_Sub12 {

	@OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
	private int anInt10869;

	@OriginalMember(owner = "client!wo", name = "M", descriptor = "Z")
	private boolean aBoolean753;

	@OriginalMember(owner = "client!wo", name = "N", descriptor = "Z")
	private boolean aBoolean754;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Lclient!qw;")
	private final Class302 aClass302_71 = new Class302();

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
	private int anInt10868 = 0;

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
	private int anInt10870 = 256;

	@OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
	private int anInt10867 = 256;

	@OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
	private final int anInt10864;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V")
	public Class3_Sub12_Sub5(@OriginalArg(0) int arg0) {
		this.anInt10864 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BID)Lclient!nca;")
	public Class3_Sub5_Sub15 method8949(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1) {
		@Pc(19) long local19 = (long) (arg0 | this.anInt10864 << 0);
		@Pc(25) Class3_Sub5_Sub15 local25 = (Class3_Sub5_Sub15) Static595.aClass325_3.method7319(local19);
		if (local25 == null) {
			local25 = new Class3_Sub5_Sub15(new short[this.anInt10864][arg0], arg1);
		} else {
			local25.aDouble18 = arg1;
			Static595.aClass325_3.method7321(local19);
		}
		return local25;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8942(@OriginalArg(0) int arg0) {
		if (this.aBoolean753) {
			return;
		}
		while (true) {
			@Pc(11) Class3_Sub5_Sub15 local11 = this.method8953();
			if (local11 == null) {
				if (this.aBoolean754) {
					this.method9034();
					Static595.aClass325_3.method7323();
				}
				return;
			}
			if (local11.aShortArrayArray6[0].length - this.anInt10869 > arg0) {
				this.anInt10869 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray6[0].length - this.anInt10869;
			this.method8952();
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8946() {
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)D")
	public synchronized double method8951() {
		if (this.anInt10868 < 1) {
			return -1.0D;
		} else {
			@Pc(24) Class3_Sub5_Sub15 local24 = (Class3_Sub5_Sub15) this.aClass302_71.method6603();
			return local24 == null ? -1.0D : local24.aDouble18 - (double) ((float) local24.aShortArrayArray6[0].length / (float) Static16.anInt10139);
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	private synchronized void method8952() {
		@Pc(15) Class3_Sub5_Sub15 local15 = this.method8953();
		if (local15 != null) {
			local15.method9034();
			this.anInt10868--;
			this.anInt10869 = 0;
			Static595.aClass325_3.method7322(local15, local15.method5473());
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Lclient!nca;")
	private synchronized Class3_Sub5_Sub15 method8953() {
		return (Class3_Sub5_Sub15) this.aClass302_71.method6603();
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
	public synchronized void method8954(@OriginalArg(1) boolean arg0) {
		this.aBoolean753 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)I")
	public synchronized int method8955() {
		return this.anInt10868;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "()Lclient!pp;")
	@Override
	public Class3_Sub12 method8945() {
		return null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLclient!nca;)V")
	public synchronized void method8957(@OriginalArg(1) Class3_Sub5_Sub15 arg0) {
		while (this.anInt10868 >= 100) {
			this.aClass302_71.method6611();
			this.anInt10868--;
		}
		this.aClass302_71.method6613(arg0);
		this.anInt10868++;
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "()I")
	@Override
	public int method8947() {
		return 1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public void method8959(@OriginalArg(0) int arg0) {
		this.anInt10870 = arg0;
		this.anInt10867 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)V")
	public synchronized void method8960() {
		this.aBoolean754 = true;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean753) {
			return;
		}
		if (this.method8953() != null) {
			@Pc(27) int local27 = arg1 + arg2;
			if (Static608.aBoolean713) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt10864 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(49) Class3_Sub5_Sub15 local49 = this.method8953();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray6;
				while (arg1 < local27 && this.anInt10869 < local55[0].length) {
					if (Static608.aBoolean713) {
						arg0[arg1++] = this.anInt10867 * local55[0][this.anInt10869];
						arg0[arg1++] = local55[local37][this.anInt10869] * this.anInt10870;
					} else {
						@Pc(89) int local89 = arg1++;
						arg0[local89] += this.anInt10870 * local55[local37][this.anInt10869] + this.anInt10867 * local55[0][this.anInt10869];
					}
					this.anInt10869++;
				}
				if (local55[0].length <= this.anInt10869) {
					this.method8952();
				}
			}
		} else if (this.aBoolean754) {
			this.method9034();
			Static595.aClass325_3.method7323();
		}
	}
}
