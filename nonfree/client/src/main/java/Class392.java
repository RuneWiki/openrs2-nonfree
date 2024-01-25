import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class392 {

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "[C")
	private static final char[] aCharArray8 = new char[64];

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
	public int anInt10803;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "Z")
	public boolean aBoolean793 = false;

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Lclient!wq;")
	private Class391 aClass391_67 = new Class391(64);

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!wq;")
	public final Class391 aClass391_68 = new Class391(500);

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Lclient!wq;")
	public final Class391 aClass391_69 = new Class391(30);

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "Lclient!wq;")
	public final Class391 aClass391_70 = new Class391(50);

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "Lclient!la;")
	public final Class208 aClass208_149;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Z")
	public boolean aBoolean795;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "Lclient!la;")
	private final Class208 aClass208_150;

	static {
		for (@Pc(82) int local82 = 0; local82 < 26; local82++) {
			aCharArray8[local82] = (char) (local82 + 65);
		}
		for (@Pc(96) int local96 = 26; local96 < 52; local96++) {
			aCharArray8[local96] = (char) (local96 + 97 - 26);
		}
		for (@Pc(112) int local112 = 52; local112 < 62; local112++) {
			aCharArray8[local112] = (char) (local112 + 48 - 52);
		}
		aCharArray8[62] = '+';
		aCharArray8[63] = '/';
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!to;IZLclient!la;Lclient!la;)V")
	public Class392(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class208 arg3, @OriginalArg(4) Class208 arg4) {
		this.aClass208_149 = arg4;
		this.aBoolean795 = arg2;
		this.aClass208_150 = arg3;
		if (this.aClass208_150 != null) {
			@Pc(47) int local47 = this.aClass208_150.method4988() - 1;
			this.aClass208_150.method5005(local47);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
	public void method9288() {
		@Pc(6) Class391 local6 = this.aClass391_67;
		synchronized (this.aClass391_67) {
			this.aClass391_67.method9286();
		}
		local6 = this.aClass391_68;
		synchronized (this.aClass391_68) {
			this.aClass391_68.method9286();
		}
		local6 = this.aClass391_69;
		synchronized (this.aClass391_69) {
			this.aClass391_69.method9286();
		}
		local6 = this.aClass391_70;
		synchronized (this.aClass391_70) {
			this.aClass391_70.method9286();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZ)V")
	public void method9289(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean795) {
			this.aBoolean795 = arg0;
			this.method9295();
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)V")
	public void method9290() {
		@Pc(6) Class391 local6 = this.aClass391_67;
		synchronized (this.aClass391_67) {
			this.aClass391_67.method9274(5);
		}
		local6 = this.aClass391_68;
		synchronized (this.aClass391_68) {
			this.aClass391_68.method9274(5);
		}
		local6 = this.aClass391_69;
		synchronized (this.aClass391_69) {
			this.aClass391_69.method9274(5);
		}
		local6 = this.aClass391_70;
		synchronized (this.aClass391_70) {
			this.aClass391_70.method9274(5);
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(ZI)V")
	public void method9291(@OriginalArg(1) int arg0) {
		this.aClass391_67 = new Class391(arg0);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
	public void method9292(@OriginalArg(1) int arg0) {
		this.anInt10803 = arg0;
		@Pc(14) Class391 local14 = this.aClass391_68;
		synchronized (this.aClass391_68) {
			this.aClass391_68.method9276(0);
		}
		local14 = this.aClass391_69;
		synchronized (this.aClass391_69) {
			this.aClass391_69.method9276(0);
		}
		local14 = this.aClass391_70;
		synchronized (this.aClass391_70) {
			this.aClass391_70.method9276(0);
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lclient!c;")
	public Class55 method9293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class391 local6 = this.aClass391_67;
		@Pc(16) Class55 local16;
		synchronized (this.aClass391_67) {
			local16 = (Class55) this.aClass391_67.method9275((long) arg1);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class208 local30 = this.aClass208_150;
		@Pc(51) byte[] local51;
		synchronized (this.aClass208_150) {
			if (arg0 != 0) {
				return null;
			}
			local51 = this.aClass208_150.method4991(Static570.method8202(arg1), Static425.method6316(arg1), 107);
		}
		local16 = new Class55();
		local16.aClass392_1 = this;
		local16.anInt911 = arg1;
		if (local51 != null) {
			local16.method851(new Class5_Sub23(local51));
		}
		local16.method854();
		if (!this.aBoolean795 && local16.aBoolean77) {
			local16.anIntArray47 = null;
			local16.aStringArray6 = null;
		}
		if (local16.aBoolean79) {
			local16.anInt948 = 0;
			local16.aBoolean86 = false;
		}
		@Pc(111) Class391 local111 = this.aClass391_67;
		synchronized (this.aClass391_67) {
			this.aClass391_67.method9273((long) arg1, local16, 1);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public void method9295() {
		@Pc(6) Class391 local6 = this.aClass391_67;
		synchronized (this.aClass391_67) {
			this.aClass391_67.method9276(0);
		}
		local6 = this.aClass391_68;
		synchronized (this.aClass391_68) {
			this.aClass391_68.method9276(0);
		}
		local6 = this.aClass391_69;
		synchronized (this.aClass391_69) {
			this.aClass391_69.method9276(0);
		}
		local6 = this.aClass391_70;
		synchronized (this.aClass391_70) {
			this.aClass391_70.method9276(0);
		}
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(ZI)V")
	public void method9297(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean793 != arg0) {
			this.aBoolean793 = arg0;
			this.method9295();
		}
	}
}
