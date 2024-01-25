import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class6_Sub5_Sub2 extends Class6_Sub5 {

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
	public int anInt2009 = -1;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	public int anInt2011 = 12800;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	public boolean aBoolean132 = true;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	public int anInt2012 = -1;

	@OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
	public int anInt2017 = 0;

	@OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
	public int anInt2021 = 0;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
	public int anInt2008 = 12800;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public final int anInt2010;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString11;

	@OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
	public final int anInt2019;

	@OriginalMember(owner = "client!ec", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString12;

	@OriginalMember(owner = "client!ec", name = "E", descriptor = "Lclient!su;")
	public final Class298 aClass298_41;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class6_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2012 = arg4;
		this.anInt2010 = arg0;
		this.anInt2009 = arg6;
		this.aString11 = arg2;
		this.aBoolean132 = arg5;
		this.anInt2019 = arg3;
		this.aString12 = arg1;
		if (this.anInt2009 == 255) {
			this.anInt2009 = 0;
		}
		this.aClass298_41 = new Class298();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[IIB)Z")
	public boolean method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(11) Class6_Sub28 local11 = (Class6_Sub28) this.aClass298_41.method6809(); local11 != null; local11 = (Class6_Sub28) this.aClass298_41.method6821()) {
			if (local11.method4576(arg0, arg2)) {
				local11.method4578(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)Z")
	public boolean method1833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) Class6_Sub28 local9 = (Class6_Sub28) this.aClass298_41.method6809(); local9 != null; local9 = (Class6_Sub28) this.aClass298_41.method6821()) {
			if (local9.method4576(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	public void method1834() {
		this.anInt2008 = 12800;
		this.anInt2021 = 0;
		this.anInt2011 = 12800;
		this.anInt2017 = 0;
		for (@Pc(23) Class6_Sub28 local23 = (Class6_Sub28) this.aClass298_41.method6809(); local23 != null; local23 = (Class6_Sub28) this.aClass298_41.method6821()) {
			if (this.anInt2011 > local23.anInt5557) {
				this.anInt2011 = local23.anInt5557;
			}
			if (this.anInt2008 > local23.anInt5556) {
				this.anInt2008 = local23.anInt5556;
			}
			if (this.anInt2021 < local23.anInt5560) {
				this.anInt2021 = local23.anInt5560;
			}
			if (local23.anInt5562 > this.anInt2017) {
				this.anInt2017 = local23.anInt5562;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI[II)Z")
	public boolean method1835(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class6_Sub28 local16 = (Class6_Sub28) this.aClass298_41.method6809(); local16 != null; local16 = (Class6_Sub28) this.aClass298_41.method6821()) {
			if (local16.method4575(arg0, arg3, arg1)) {
				local16.method4578(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[II)Z")
	public boolean method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(15) Class6_Sub28 local15 = (Class6_Sub28) this.aClass298_41.method6809(); local15 != null; local15 = (Class6_Sub28) this.aClass298_41.method6821()) {
			if (local15.method4580(arg1, arg0)) {
				local15.method4579(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
