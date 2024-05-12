import sign.signlink;

final class Class1_Sub1_Sub3_Sub2 extends Class1_Sub1_Sub3 {

	private int anInt937;

	private boolean aBoolean163 = false;

	String aString30;

	boolean aBoolean164 = false;

	int anInt938;

	int anInt939;

	int[] anIntArray234 = new int[12];

	int[] anIntArray235 = new int[5];

	int anInt940;

	long aLong27;

	int anInt941;

	int anInt942;

	int anInt943;

	int anInt944;

	int anInt945;

	int anInt946;

	Class1_Sub3_Sub1 aClass1_Sub3_Sub1_11;

	int anInt947;

	int anInt948;

	int anInt949;

	int anInt950;

	boolean aBoolean165 = false;

	static Class35 aClass35_9 = new Class35((byte) 0, 200);

	public final void method572(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			arg1.anInt561 = 0;
			this.anInt938 = arg1.method391();
			this.anInt939 = arg1.method391();
			int var4;
			int var5;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = arg1.method391();
				if (var4 == 0) {
					this.anIntArray234[var3] = 0;
				} else {
					var5 = arg1.method391();
					this.anIntArray234[var3] = (var4 << 8) + var5;
				}
			}
			for (var4 = 0; var4 < 5; ++var4) {
				var5 = arg1.method391();
				if (var5 < 0 || var5 >= client.anIntArrayArray4[var4].length) {
					var5 = 0;
				}
				this.anIntArray235[var4] = var5;
			}
			if (!arg0) {
				super.anInt894 = arg1.method393();
				if (super.anInt894 == 65535) {
					super.anInt894 = -1;
				}
				super.anInt895 = arg1.method393();
				if (super.anInt895 == 65535) {
					super.anInt895 = -1;
				}
				super.anInt896 = arg1.method393();
				if (super.anInt896 == 65535) {
					super.anInt896 = -1;
				}
				super.anInt897 = arg1.method393();
				if (super.anInt897 == 65535) {
					super.anInt897 = -1;
				}
				super.anInt898 = arg1.method393();
				if (super.anInt898 == 65535) {
					super.anInt898 = -1;
				}
				super.anInt899 = arg1.method393();
				if (super.anInt899 == 65535) {
					super.anInt899 = -1;
				}
				super.anInt900 = arg1.method393();
				if (super.anInt900 == 65535) {
					super.anInt900 = -1;
				}
				this.aString30 = Class40.method542(0, Class40.method539(arg1.method397(603), false));
				this.anInt940 = arg1.method391();
				this.aBoolean164 = true;
				this.aLong27 = 0L;
				for (var5 = 0; var5 < 12; ++var5) {
					this.aLong27 <<= 4;
					if (this.anIntArray234[var5] >= 256) {
						this.aLong27 += (long) (this.anIntArray234[var5] - 256);
					}
				}
				if (this.anIntArray234[0] >= 256) {
					this.aLong27 += (long) (this.anIntArray234[0] - 256 >> 4);
				}
				if (this.anIntArray234[1] >= 256) {
					this.aLong27 += (long) (this.anIntArray234[1] - 256 >> 8);
				}
				for (int var6 = 0; var6 < 5; ++var6) {
					this.aLong27 <<= 3;
					this.aLong27 += (long) this.anIntArray235[var6];
				}
				this.aLong27 <<= 1;
				this.aLong27 += (long) this.anInt938;
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("66007, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method568(boolean arg0) {
		try {
			if (!this.aBoolean164) {
				return null;
			} else {
				Class1_Sub3_Sub1 var2 = this.method573(false);
				super.anInt933 = var2.anInt368;
				var2.aBoolean84 = true;
				if (this.aBoolean165) {
					return var2;
				} else {
					if (super.anInt920 != -1 && super.anInt921 != -1) {
						Class21 var3 = Class21.aClass21Array1[super.anInt920];
						Class1_Sub3_Sub1 var4 = new Class1_Sub3_Sub1(var3.method409(), true, !var3.aBoolean131, this.anInt937, false);
						var4.method236(-super.anInt924, 0, -122, 0);
						var4.method230(4);
						var4.method231(-16599, var3.aClass19_1.anIntArray186[super.anInt921]);
						var4.anIntArrayArray7 = null;
						var4.anIntArrayArray6 = null;
						if (var3.anInt571 != 128 || var3.anInt572 != 128) {
							var4.method239(var3.anInt571, 2, var3.anInt572, var3.anInt571);
						}
						var4.method240(64 + var3.anInt574, 850 + var3.anInt575, -30, -50, -30, true);
						Class1_Sub3_Sub1[] var5 = new Class1_Sub3_Sub1[] { var2, var4 };
						var2 = new Class1_Sub3_Sub1(var5, (byte) -31, 2, true);
					}
					if (this.aClass1_Sub3_Sub1_11 != null) {
						if (client.anInt266 >= this.anInt943) {
							this.aClass1_Sub3_Sub1_11 = null;
						}
						if (client.anInt266 >= this.anInt942 && client.anInt266 < this.anInt943) {
							Class1_Sub3_Sub1 var7 = this.aClass1_Sub3_Sub1_11;
							var7.method236(this.anInt945 - this.anInt941, this.anInt944 - super.anInt890, -122, this.anInt946 - super.anInt891);
							if (super.anInt934 == 512) {
								var7.method234(0);
								var7.method234(0);
								var7.method234(0);
							} else if (super.anInt934 == 1024) {
								var7.method234(0);
								var7.method234(0);
							} else if (super.anInt934 == 1536) {
								var7.method234(0);
							}
							Class1_Sub3_Sub1[] var9 = new Class1_Sub3_Sub1[] { var2, var7 };
							var2 = new Class1_Sub3_Sub1(var9, (byte) -31, 2, true);
							if (super.anInt934 == 512) {
								var7.method234(0);
							} else if (super.anInt934 == 1024) {
								var7.method234(0);
								var7.method234(0);
							} else if (super.anInt934 == 1536) {
								var7.method234(0);
								var7.method234(0);
								var7.method234(0);
							}
							var7.method236(this.anInt941 - this.anInt945, super.anInt890 - this.anInt944, -122, super.anInt891 - this.anInt946);
						}
					}
					var2.aBoolean84 = true;
					if (!arg0) {
						for (int var8 = 1; var8 > 0; ++var8) {
						}
					}
					return var2;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("53201, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method573(boolean arg0) {
		try {
			long var2 = this.aLong27;
			int var4 = -1;
			int var5 = -1;
			int var6 = -1;
			int var7 = -1;
			if (super.anInt915 >= 0 && super.anInt918 == 0) {
				Class19 var8 = Class19.aClass19Array1[super.anInt915];
				var4 = var8.anIntArray186[super.anInt916];
				if (super.anInt912 >= 0 && super.anInt912 != super.anInt894) {
					var5 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
				}
				if (var8.anInt546 >= 0) {
					var6 = var8.anInt546;
					var2 += (long) (var6 - this.anIntArray234[5] << 40);
				}
				if (var8.anInt547 >= 0) {
					var7 = var8.anInt547;
					var2 += (long) (var7 - this.anIntArray234[3] << 48);
				}
			} else if (super.anInt912 >= 0) {
				var4 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
			}
			Class1_Sub3_Sub1 var16 = (Class1_Sub3_Sub1) aClass35_9.method527(var2);
			if (var16 == null) {
				Class1_Sub3_Sub1[] var9 = new Class1_Sub3_Sub1[12];
				int var10 = 0;
				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = this.anIntArray234[var11];
					if (var7 >= 0 && var11 == 3) {
						var12 = var7;
					}
					if (var6 >= 0 && var11 == 5) {
						var12 = var6;
					}
					if (var12 >= 256 && var12 < 512) {
						var9[var10++] = Class13.aClass13Array1[var12 - 256].method306();
					}
					if (var12 >= 512) {
						Class5 var13 = Class5.method54(var12 - 512);
						Class1_Sub3_Sub1 var14 = var13.method60((byte) 6, this.anInt938);
						if (var14 != null) {
							var9[var10++] = var14;
						}
					}
				}
				var16 = new Class1_Sub3_Sub1(0, var9, var10);
				for (var12 = 0; var12 < 5; ++var12) {
					if (this.anIntArray235[var12] != 0) {
						var16.method237(client.anIntArrayArray4[var12][0], client.anIntArrayArray4[var12][this.anIntArray235[var12]]);
						if (var12 == 1) {
							var16.method237(client.anIntArray70[0], client.anIntArray70[this.anIntArray235[var12]]);
						}
					}
				}
				var16.method230(4);
				var16.method240(64, 850, -30, -50, -30, true);
				aClass35_9.method528(6, var2, var16);
			}
			if (this.aBoolean165) {
				return var16;
			} else {
				Class1_Sub3_Sub1 var17 = new Class1_Sub3_Sub1(0, var16, true);
				if (arg0) {
					this.aBoolean163 = !this.aBoolean163;
				}
				if (var4 != -1 && var5 != -1) {
					var17.method232(var5, 3, var4, Class19.aClass19Array1[super.anInt915].anIntArray189);
				} else if (var4 != -1) {
					var17.method231(-16599, var4);
				}
				var17.method227(2992);
				var17.anIntArrayArray7 = null;
				var17.anIntArrayArray6 = null;
				return var17;
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("77654, " + arg0 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method574(int arg0) {
		try {
			if (!this.aBoolean164) {
				return null;
			} else {
				Class1_Sub3_Sub1[] var2 = new Class1_Sub3_Sub1[12];
				int var3 = 0;
				for (int var4 = 0; var4 < 12; ++var4) {
					int var5 = this.anIntArray234[var4];
					if (var5 >= 256 && var5 < 512) {
						var2[var3++] = Class13.aClass13Array1[var5 - 256].method307(false);
					}
					if (var5 >= 512) {
						Class1_Sub3_Sub1 var6 = Class5.method54(var5 - 512).method61(-22246, this.anInt938);
						if (var6 != null) {
							var2[var3++] = var6;
						}
					}
				}
				Class1_Sub3_Sub1 var8 = new Class1_Sub3_Sub1(0, var2, var3);
				for (int var9 = 0; var9 < 5; ++var9) {
					if (this.anIntArray235[var9] != 0) {
						var8.method237(client.anIntArrayArray4[var9][0], client.anIntArrayArray4[var9][this.anIntArray235[var9]]);
						if (var9 == 1) {
							var8.method237(client.anIntArray70[0], client.anIntArray70[this.anIntArray235[var9]]);
						}
					}
				}
				if (arg0 < 0) {
					return var8;
				} else {
					throw new NullPointerException();
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("60004, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method571(boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean163 = !this.aBoolean163;
			}
			return this.aBoolean164;
		} catch (RuntimeException var3) {
			signlink.reporterror("46403, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
