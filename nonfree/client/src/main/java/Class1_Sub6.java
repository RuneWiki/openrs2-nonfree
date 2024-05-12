import sign.signlink;

final class Class1_Sub6 extends Class1 {

	public int anInt651;

	public int anInt652;

	public int anInt653;

	public int anInt654;

	public int anInt655;

	public Class19 aClass19_2;

	public int anInt656;

	public int anInt657;

	public Class1_Sub6(boolean arg0, int arg1, int arg2, int arg3, int arg4, Class19 arg5, int arg6, int arg7) {
		try {
			this.anInt651 = arg2;
			this.anInt652 = arg4;
			this.anInt653 = arg7;
			this.anInt654 = arg6;
			if (arg3 != 0) {
				throw new NullPointerException();
			} else {
				this.anInt655 = arg1;
				this.aClass19_2 = arg5;
				if (arg0 && arg5.anInt544 != -1) {
					this.anInt656 = (int) (Math.random() * (double) this.aClass19_2.anInt543);
					this.anInt657 = (int) (Math.random() * (double) this.aClass19_2.anIntArray188[this.anInt656]);
				} else {
					this.anInt656 = -1;
					this.anInt657 = 0;
				}
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("91798, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}
}
