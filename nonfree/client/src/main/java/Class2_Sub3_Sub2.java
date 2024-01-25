import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public abstract class Class2_Sub3_Sub2 extends Class2_Sub3 {

	@OriginalMember(owner = "client!td", name = "D", descriptor = "Ljava/lang/String;")
	public static final String aString69;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Ljava/lang/String;")
	public static final String aString70;

	@OriginalMember(owner = "client!td", name = "B", descriptor = "S")
	public final short aShort90;

	static {
		@Pc(3) String local3 = "Unknown";
		try {
			local3 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(9) Exception local9) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(20) Exception local20) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(31) Exception local31) {
		}
		aString69 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(42) Exception local42) {
		}
		aString70 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(53) Exception local53) {
		}
		local3.toLowerCase();
		local3 = "~/";
		try {
			local3 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(64) Exception local64) {
		}
		new File(local3);
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIII)V")
	protected Class2_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aShort90 = (short) arg5;
		super.aByte129 = (byte) arg4;
		super.anInt10428 = arg0;
		super.aByte128 = (byte) arg3;
		super.anInt10424 = arg2;
		super.anInt10429 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "i", descriptor = "(I)Z")
	@Override
	public final boolean method8580() {
		return Static622.aBooleanArrayArray11[Static157.anInt3831 + (super.anInt10428 >> Static276.anInt5846) - Static607.anInt10024][(super.anInt10424 >> Static276.anInt5846) + Static157.anInt3831 - Static23.anInt369];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[Lclient!pk;)I")
	@Override
	public final int method8577(@OriginalArg(1) Class3_Sub27[] arg0) {
		@Pc(10) int local10 = super.anInt10428 >> Static276.anInt5846;
		@Pc(15) int local15 = super.anInt10424 >> Static276.anInt5846;
		@Pc(17) int local17 = 0;
		if (local10 == Static607.anInt10024) {
			local17++;
		} else if (Static607.anInt10024 < local10) {
			local17 += 2;
		}
		if (Static23.anInt369 == local15) {
			local17 += 3;
		} else if (Static23.anInt369 > local15) {
			local17 += 6;
		}
		@Pc(49) int local49 = Static297.anIntArray357[local17];
		if ((this.aShort90 & local49) != 0) {
			return this.method8568(local10, local15, arg0);
		} else if (this.aShort90 == 1 && local10 > 0) {
			return this.method8568(local10 - 1, local15, arg0);
		} else if (this.aShort90 == 4 && Static642.anInt10523 >= local10) {
			return this.method8568(local10 + 1, local15, arg0);
		} else if (this.aShort90 == 8 && local15 > 0) {
			return this.method8568(local10, local15 - 1, arg0);
		} else if (this.aShort90 == 2 && local15 <= Static158.anInt3845) {
			return this.method8568(local10, local15 + 1, arg0);
		} else if (this.aShort90 == 16 && local10 > 0 && local15 <= Static158.anInt3845) {
			return this.method8568(local10 - 1, local15 + 1, arg0);
		} else if (this.aShort90 == 32 && Static642.anInt10523 >= local10 && local15 <= Static158.anInt3845) {
			return this.method8568(local10 + 1, local15 + 1, arg0);
		} else if (this.aShort90 == 128 && local10 > 0 && local15 > 0) {
			return this.method8568(local10 - 1, local15 - 1, arg0);
		} else if (this.aShort90 == 64 && local10 <= Static642.anInt10523 && local15 > 0) {
			return this.method8568(local10 + 1, local15 + -1, arg0);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ILclient!ha;)Z")
	@Override
	public final boolean method8567(@OriginalArg(1) Class33 arg0) {
		return Static423.method6553(super.aByte129, super.anInt10428 >> Static276.anInt5846, this, super.anInt10424 >> Static276.anInt5846);
	}
}
