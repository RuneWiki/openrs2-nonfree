import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "I")
	private int anInt7884;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "Lclient!mr;")
	private final Class223 aClass223_44 = new Class223();

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "I")
	private int anInt7882 = 256;

	@OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
	private int anInt7885 = 0;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
	private int anInt7883 = 256;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
	private final int anInt7874;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub4(@OriginalArg(0) int arg0) {
		this.anInt7874 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "()I")
	@Override
	public int method8763() {
		return 1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8761() {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BDI)Lclient!fl;")
	public Class3_Sub4_Sub7 method6823(@OriginalArg(1) double arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg1 | this.anInt7874 << 0);
		@Pc(17) Class3_Sub4_Sub7 local17 = (Class3_Sub4_Sub7) Static347.aClass357_1.method8390(local11);
		if (local17 == null) {
			local17 = new Class3_Sub4_Sub7(new short[this.anInt7874][arg1], arg0);
		} else {
			local17.aDouble8 = arg0;
			Static347.aClass357_1.method8394(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!fl;I)V")
	public synchronized void method6824(@OriginalArg(0) Class3_Sub4_Sub7 arg0) {
		while (this.anInt7885 >= 100) {
			this.aClass223_44.method5872();
			this.anInt7885--;
		}
		this.aClass223_44.method5868(arg0);
		this.anInt7885++;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()Lclient!os;")
	@Override
	public Class3_Sub7 method8760() {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)I")
	public synchronized int method6825() {
		return this.anInt7885;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)V")
	public synchronized void method6827() {
		this.aBoolean550 = true;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V")
	public void method6828(@OriginalArg(0) int arg0) {
		this.anInt7883 = arg0;
		this.anInt7882 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Lclient!fl;")
	private synchronized Class3_Sub4_Sub7 method6830() {
		return (Class3_Sub4_Sub7) this.aClass223_44.method5874();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8757(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean551) {
			return;
		}
		if (this.method6830() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static447.aBoolean556) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt7874 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(51) Class3_Sub4_Sub7 local51 = this.method6830();
				if (local51 == null) {
					return;
				}
				@Pc(57) short[][] local57 = local51.aShortArrayArray6;
				while (local27 > arg1 && this.anInt7884 < local57[0].length) {
					if (Static447.aBoolean556) {
						arg0[arg1++] = local57[0][this.anInt7884] * this.anInt7882;
						arg0[arg1++] = local57[local37][this.anInt7884] * this.anInt7883;
					} else {
						@Pc(91) int local91 = arg1++;
						arg0[local91] += local57[0][this.anInt7884] * this.anInt7882 + this.anInt7883 * local57[local37][this.anInt7884];
					}
					this.anInt7884++;
				}
				if (local57[0].length <= this.anInt7884) {
					this.method6833();
				}
			}
		} else if (this.aBoolean550) {
			this.method8769();
			Static347.aClass357_1.method8389();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8758(@OriginalArg(0) int arg0) {
		if (this.aBoolean551) {
			return;
		}
		while (true) {
			@Pc(11) Class3_Sub4_Sub7 local11 = this.method6830();
			if (local11 == null) {
				if (this.aBoolean550) {
					this.method8769();
					Static347.aClass357_1.method8389();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray6[0].length - this.anInt7884) {
				this.anInt7884 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray6[0].length - this.anInt7884;
			this.method6833();
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)D")
	public synchronized double method6831() {
		if (this.anInt7885 < 1) {
			return -1.0D;
		} else {
			@Pc(24) Class3_Sub4_Sub7 local24 = (Class3_Sub4_Sub7) this.aClass223_44.method5874();
			return local24 == null ? -1.0D : local24.aDouble8 - (double) ((float) local24.aShortArrayArray6[0].length / (float) Static276.anInt4980);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)V")
	public synchronized void method6832(@OriginalArg(0) boolean arg0) {
		this.aBoolean551 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
	private synchronized void method6833() {
		@Pc(7) Class3_Sub4_Sub7 local7 = this.method6830();
		if (local7 != null) {
			local7.method8769();
			this.anInt7885--;
			this.anInt7884 = 0;
			Static347.aClass357_1.method8392(local7.method2863(), local7);
		}
	}
}
